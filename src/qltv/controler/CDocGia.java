
package qltv.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import qltv.model.DocGia;
import qltv.util.ConvertDate;
import qltv.util.DBConnect;
import qltv.view.GUIQuanLyDocGia;

public class CDocGia {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    

    public CDocGia() {
        con = DBConnect.getConnection();
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // lay ra toan bo danh sach doc gia 
    public List<DocGia> selectAll() {
        try {
            con = DBConnect.getConnection();
            st = con.createStatement();

            rs = st.executeQuery("SELECT * FROM DocGia;");
            List<DocGia> docGiaList = new ArrayList<DocGia>();
            while (rs.next()) {
                DocGia docGia = new DocGia();
                docGia.setMaDocGia(rs.getString("MaDG"));
                docGia.setTenDocGia(rs.getString("TenDG"));
                docGia.setHanSuDung(rs.getDate("HanSuDung"));
                docGia.setNgaySinh(rs.getDate("NgaySinh"));
                docGia.setDiaChi(rs.getString("DiaChi"));
                docGia.setSoDienThoai(rs.getString("SoDienThoai"));
                docGia.setGioiTinh(rs.getString("GioiTinh"));

                docGiaList.add(docGia);
            }

            return docGiaList;
        } catch (SQLException ex) {
            Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return null;

    }

    // lay r danh sach doc gia khi thuc hien tim kiem
    // columName = {ma, ten, dia chi, so dien thoai, gioi tinh}
    public List<DocGia> search(DocGia docGia, String columnName) throws SQLException {
        try {
            String sql = "SELECT * FROM DocGia WHERE 1 = 1 ";
            switch (columnName) {
                case "Mã độc giả": {
                    sql += " AND MaDG LIKE N'%" + docGia.getMaDocGia() + "%';";

                    break;
                }

                case "Tên độc giả": {
                    sql += " AND TenDG LIKE N'%" + docGia.getTenDocGia() + "%';";

                    break;
                }
                case "Địa chỉ": {
                    sql += " AND DiaChi LIKE N'%" + docGia.getDiaChi() + "%';";
                    break;
                }
                case "Số điện thoại": {
                    sql += " AND SoDienThoai LIKE N'%" + docGia.getSoDienThoai() + "%';";
                    break;
                }
                case "Giới tính": {
                    sql += " AND GioiTinh LIKE N'%" + docGia.getGioiTinh() + "%';";
                    break;
                }
                
                case "None": {
                    break;
                }
            }
            System.out.println(sql);
            rs = st.executeQuery(sql);

            List<DocGia> docGiaList = new ArrayList<DocGia>();
            while (rs.next()) {
                DocGia dg = new DocGia();

                dg.setMaDocGia(rs.getString("MaDG"));
                dg.setTenDocGia(rs.getString("TenDG"));
                dg.setHanSuDung(rs.getDate("HanSuDung"));
                dg.setNgaySinh(rs.getDate("NgaySinh"));
                dg.setDiaChi(rs.getString("DiaChi"));
                dg.setSoDienThoai(rs.getString("SoDienThoai"));
                dg.setGioiTinh(rs.getString("GioiTinh"));

                docGiaList.add(dg);
            }

            return docGiaList;
        } catch (SQLException ex) {
            Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
        }

        return null;

    }

    // insert docGia
    public boolean insert(DocGia docGia) {

        try {
            String sql = "INSERT INTO DocGia(MaDG, TenDG, HanSuDung, NgaySinh, DiaChi, SoDienThoai, GioiTinh) VALUES(?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, docGia.getMaDocGia());
            ps.setString(2, docGia.getTenDocGia());
            ps.setDate(3, ConvertDate.convertDate(docGia.getHanSuDung())); // chuyen date tu java -> date trong sql
            ps.setDate(4, ConvertDate.convertDate(docGia.getNgaySinh()));
            ps.setString(5, docGia.getDiaChi());
            ps.setString(6, docGia.getSoDienThoai());
            ps.setString(7, docGia.getGioiTinh());

            System.out.println(sql);
            return ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

// update DL
    public boolean update(DocGia docGia) {
        try {
            String sql = "UPDATE DocGia SET TenDG = ?, HanSuDung = ?, NgaySinh = ?, DiaChi = ?, SoDienThoai = ?, GioiTinh = ? WHERE MaDG = ? ";

            ps = con.prepareStatement(sql);

            ps.setString(1, docGia.getTenDocGia());
            ps.setDate(2, ConvertDate.convertDate(docGia.getHanSuDung())); // chuyen date tu java -> date trong sql
            ps.setDate(3, ConvertDate.convertDate(docGia.getNgaySinh()));
            ps.setString(4, docGia.getDiaChi());
            ps.setString(5, docGia.getSoDienThoai());
            ps.setString(6, docGia.getGioiTinh());
            ps.setString(7, docGia.getMaDocGia());

            System.out.println(sql);
            return ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }
    
    // Xoa docGia
    public boolean delete(DocGia docGia){
        
        try {
            String sql = "DELETE FROM DocGia WHERE MaDG = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, docGia.getMaDocGia());
            
            return ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

   
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    private Vector<DocGia> dsDocGia;
//    private DBConnect con;
//    
//    
//    
//    
//    
//
//    public CDocGia() {
//        con = new DBConnect();
//        con.getConnection();
//        String[] key = null;
//        dsDocGia = new Vector<DocGia>(100);
//        Vector<String> vec = con.select("DocGia", key); // lay ra tat ca doc gia trong CSDL
//        for (String s : vec) {
//            dsDocGia.add(new DocGia(s)); // add tat ca DG vao dsDG
//        }
//    }
//
//    public boolean add(String record) {
//        DocGia docGia = new DocGia(record);
//        String[] values = new String[7];
//        values = record.split("\t");
//        if (!con.insert("DocGia", values)) {  // k insert đươc thi false
//            return false;
//        }
//        dsDocGia.add(docGia); // neu insert dc thi add docGia vao dsDG
//        return true;
//    }
//
//    public int searchIndex(String maDG) {
//        int i = 0;
//        for (DocGia docGia : dsDocGia) {
//            if (docGia.getMaDocGia().equals(maDG)) {
//                return i;
//            }
//            i++;
//        }
//        return -1;
//    }
//
//    public boolean delete(String key) {
//        if (!con.delete("DocGia", "MaDG", key)) {
//            return false;
//        }
//
//        int pos = searchIndex(key);
//        dsDocGia.remove(pos);
//        return true;
//    }

