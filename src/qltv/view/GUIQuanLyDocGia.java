/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import qltv.controler.CDocGia;
import qltv.model.DocGia;
import qltv.util.ConvertDate;
import qltv.util.DBConnect;
import qltv.util.PrintPDF;

// khi insert phải chuyen Date tu java -> Date sql
// Dùng ConvertDate()
public class GUIQuanLyDocGia extends javax.swing.JPanel {

    DefaultTableModel dm;
    CDocGia cdocGia = new CDocGia();
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    SimpleDateFormat sdf = new SimpleDateFormat();
    List<DocGia> docGiaList = null;

    public GUIQuanLyDocGia() {
        initComponents();

        con = DBConnect.getConnection();
        try {
            st = con.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadDataInTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfMaDocGia = new javax.swing.JTextField();
        tfTenDocGia = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        tfSoDienThoai = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnThemTuFile = new javax.swing.JButton();
        dcNgaySInh = new com.toedter.calendar.JDateChooser();
        dcHansuDung = new com.toedter.calendar.JDateChooser();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfTimKiem = new javax.swing.JTextField();
        cbbTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        btnXuatBieuMau = new javax.swing.JButton();
        btnXuatPDF = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDocGia = new javax.swing.JTable();

        jPanel1.setMaximumSize(new java.awt.Dimension(1020, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 490));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐỘC GIẢ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Thông tin độc giả")));
        jPanel2.setMaximumSize(new java.awt.Dimension(740, 225));
        jPanel2.setMinimumSize(new java.awt.Dimension(740, 225));

        jLabel2.setText("Mã độc giả : ");

        jLabel3.setText("Họ và tên :");

        jLabel4.setText("Ngày sinh : ");

        jLabel5.setText("Địa chỉ : ");

        jLabel6.setText("Giới tính : ");

        jLabel7.setText("Số điện thoại : ");

        jLabel8.setText("Hạn sử dụng : ");

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThemTuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/folder.png"))); // NOI18N
        btnThemTuFile.setText("Thêm file");
        btnThemTuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTuFileActionPerformed(evt);
            }
        });

        GioiTinh.add(rbNam);
        rbNam.setText("Nam");

        GioiTinh.add(rbNu);
        rbNu.setText("Nữ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThemTuFile))
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfTenDocGia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMaDocGia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcNgaySInh, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dcHansuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbNam)
                                        .addGap(27, 27, 27)
                                        .addComponent(rbNu))
                                    .addComponent(tfSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dcHansuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfTenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tfSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(dcNgaySInh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rbNam)
                        .addComponent(rbNu)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnRefresh)
                    .addComponent(btnThemTuFile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Tìm kiếm độc giả"));

        jLabel9.setText("Nhập từ khóa tìm kiếm : ");

        cbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã độc giả", "Tên độc giả", "Địa chỉ", "Số điện thoại", "Giới tính", "None", " ", " " }));

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search1.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXuatBieuMau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/excel.png"))); // NOI18N
        btnXuatBieuMau.setText("Xuất biểu mẫu");
        btnXuatBieuMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatBieuMauActionPerformed(evt);
            }
        });

        btnXuatPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/pdf.png"))); // NOI18N
        btnXuatPDF.setText("Xuất PDF");
        btnXuatPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(cbbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXuatBieuMau)
                        .addGap(0, 34, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnXuatPDF)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatBieuMau)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXuatPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách độc giả"));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDocGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDocGia);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataInTable() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        dm = new DefaultTableModel();
        dm.addColumn("Mã độc giả");
        dm.addColumn("Tên độc giả");
        dm.addColumn("Hạn sử dụng");
        dm.addColumn("Ngày sinh");
        dm.addColumn("Địa chỉ");
        dm.addColumn("Số điện thoại");
        dm.addColumn("Giới tính");

        // lay ra toan bo danh sach doc gia
        cdocGia = new CDocGia();

        docGiaList = cdocGia.selectAll();

        // add toan bo DL tu CSDL vao table
        for (DocGia dg : docGiaList) {
            Vector vector = new Vector();

            vector.add(dg.getMaDocGia());
            vector.add(dg.getTenDocGia());
            vector.add(dg.getHanSuDung() != null ? sdf.format(dg.getHanSuDung()) : ""); // formatDate tu java -> Date sql
            vector.add(dg.getNgaySinh() != null ? sdf.format(dg.getNgaySinh()) : "");
            vector.add(dg.getDiaChi() != null ? dg.getDiaChi() : "");
            vector.add(dg.getSoDienThoai() != null ? dg.getSoDienThoai() : "");
            vector.add(dg.getGioiTinh());
            // tao hang
            dm.addRow(vector);
        }
        // Dua DL tu dm vao table
        tbDocGia.setModel(dm);
    }

    private void loadDateSearch() {
        SimpleDateFormat sdf = new SimpleDateFormat();

        //khởi tạo lại model, xóa hết cột cũ dòng cũ đi
        dm = new DefaultTableModel();
        //tạo cột
        dm.addColumn("Mã độc giả");
        dm.addColumn("Tên độc giả");
        dm.addColumn("Hạn sử dụng");
        dm.addColumn("Ngày sinh");
        dm.addColumn("Địa chỉ");
        dm.addColumn("Số điện thoại");
        dm.addColumn("Giới tính");

        // lay ra toan bo danh sach doc gia
        cdocGia = new CDocGia();

        DocGia docGia = new DocGia();
        docGia.setMaDocGia(tfTimKiem.getText());
        docGia.setTenDocGia(tfTimKiem.getText());
        docGia.setDiaChi(tfTimKiem.getText());
        docGia.setSoDienThoai(tfTimKiem.getText());
        docGia.setGioiTinh(tfTimKiem.getText());

        String result = (String) cbbTimKiem.getSelectedItem();
        System.out.println("result search = " + result);

        if (result.equals("Mã độc giả")) {
            try {
                docGiaList = cdocGia.search(docGia, result);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (result.equals("Tên độc giả")) {
            try {
                docGiaList = cdocGia.search(docGia, result);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (result.equals("Địa chỉ")) {
            try {
                docGiaList = cdocGia.search(docGia, result);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (result.equals("Số điện thoại")) {
            try {
                docGiaList = cdocGia.search(docGia, result);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (result.equals("Giới tính")) {
            try {
                docGiaList = cdocGia.search(docGia, result);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (result.equals("None")) {
            try {
                docGiaList = cdocGia.search(docGia, result);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // add toan bo DL tu CSDL vao table
        for (DocGia dg : docGiaList) {
            Vector vector = new Vector();

            vector.add(dg.getMaDocGia());
            vector.add(dg.getTenDocGia());
            vector.add(dg.getHanSuDung() != null ? sdf.format(dg.getHanSuDung()) : ""); // formatDate tu java -> Date sql
            vector.add(dg.getNgaySinh() != null ? sdf.format(dg.getNgaySinh()) : "");
            vector.add(dg.getDiaChi() != null ? dg.getDiaChi() : "");
            vector.add(dg.getSoDienThoai() != null ? dg.getSoDienThoai() : "");
            vector.add(dg.getGioiTinh());
            // tao hang
            dm.addRow(vector);
        }
        // Dua DL tu dm vao table
        tbDocGia.setModel(dm);

    }

    private void clear() {
        tfMaDocGia.setText("");
        tfTenDocGia.setText("");
        tfDiaChi.setText("");
        tfSoDienThoai.setText("");
    }


    private void themFile1() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("G:\\"));
        int check = chooser.showOpenDialog(this);
        if (check == chooser.APPROVE_OPTION) {

            try {
                String[] titile = new String[]{"Mã độc giả", "Tên độc giả", "Hạn sử dụng", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Giới tính"};

                dm = new DefaultTableModel(titile, 0);
                File file = chooser.getSelectedFile();

                Workbook wb = Workbook.getWorkbook(file);
                Sheet sheet = wb.getSheet(0);
                Cell cell;

                DBConnect conn = new DBConnect();
                String[] values = new String[7];
                for (int i = 1; i < sheet.getRows(); i++) {
                    DocGia dg = new DocGia();

                    cell = sheet.getCell(0, i);
                    values[0] = cell.getContents();
                    cell = sheet.getCell(1, i);
                    values[1] = cell.getContents();
                    cell = sheet.getCell(2, i);
                    values[2] = cell.getContents();
                    cell = sheet.getCell(3, i);
                    values[3] = cell.getContents();
                    cell = sheet.getCell(4, i);
                    values[4] = cell.getContents();
                    cell = sheet.getCell(5, i);
                    values[5] = cell.getContents();
                    cell = sheet.getCell(6, i);
                    values[6] = cell.getContents();

                    conn.insert("DocGia", values); // insert DL vao trong CSDL
                    dm.addRow(values);
                }

                tbDocGia.setModel(dm);
            } catch (IOException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Lỗi IOException");
            } catch (BiffException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    private void writeFileExcel() {

        WritableWorkbook wb;

        try {
            wb = Workbook.createWorkbook(new File("G:\\ouputDG.xls"));
            WritableSheet sheet = wb.createSheet("DocGia", 0);
            try {
                sheet.addCell(new jxl.write.Label(0, 0, "DANH SACH DOC GIA"));
                sheet.addCell(new jxl.write.Label(0, 1, "Mã độc giả")); // cột 0 d
                sheet.addCell(new jxl.write.Label(1, 1, "Tên độc giả"));
                sheet.addCell(new jxl.write.Label(2, 1, "Hạn sử dụng"));
                sheet.addCell(new jxl.write.Label(3, 1, "Ngày sinh"));
                sheet.addCell(new jxl.write.Label(4, 1, "Địa chỉ"));
                sheet.addCell(new jxl.write.Label(5, 1, "Số điện thoại"));
                sheet.addCell(new jxl.write.Label(6, 1, "Giới tính"));
                int rowBegin = 2;
                TableModel tableModel = tbDocGia.getModel();
                for (int row = rowBegin, i = 0; row < rowBegin + tbDocGia.getRowCount(); row++, i++) {
                    sheet.addCell(new jxl.write.Label(0, row, (String) tableModel.getValueAt(i, 0)));
                    sheet.addCell(new jxl.write.Label(1, row, (String) tableModel.getValueAt(i, 1)));
                    sheet.addCell(new jxl.write.Label(2, row, (String) tableModel.getValueAt(i, 2)));
                    sheet.addCell(new jxl.write.Label(3, row, (String) tableModel.getValueAt(i, 3)));
                    sheet.addCell(new jxl.write.Label(4, row, (String) tableModel.getValueAt(i, 4)));
                    sheet.addCell(new jxl.write.Label(5, row, (String) tableModel.getValueAt(i, 5)));
                    sheet.addCell(new jxl.write.Label(6, row, (String) tableModel.getValueAt(i, 6)));

                }
                wb.write();
                wb.close();
                JOptionPane.showMessageDialog(null, "success!");
            } catch (WriteException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadDataInTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThemTuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTuFileActionPerformed
        themFile1();
    }//GEN-LAST:event_btnThemTuFileActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        loadDateSearch();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatBieuMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatBieuMauActionPerformed
        writeFileExcel();
    }//GEN-LAST:event_btnXuatBieuMauActionPerformed

    private void btnXuatPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPDFActionPerformed
        String[] header = {"Mã độc giả", "Tên độc giả", "Hạn sử dụng", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Giới tính"};

        loadDateSearch();
        String[][] data = new String[docGiaList.size()][];
        String str = null;
        for (int i = 0; i < docGiaList.size(); i++) {
            str = docGiaList.get(i).getMaDocGia() + "\t" + docGiaList.get(i).getTenDocGia() + "\t" + docGiaList.get(i).getHanSuDung() + "\t" + docGiaList.get(i).getNgaySinh() + "\t" + docGiaList.get(i).getDiaChi() + "\t" + docGiaList.get(i).getSoDienThoai() + "\t" + docGiaList.get(i).getGioiTinh();
            data[i] = str.split("\t");
        }

        PrintPDF print = new PrintPDF();
        JFileChooser fc = new JFileChooser();
        int retirnval = fc.showSaveDialog(this);
        if (retirnval == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                print.printSearchReport(file.getPath(), "DocGia", header, data, (String) cbbTimKiem.getSelectedItem(), tfTimKiem.getText(), "độc giả");
            } catch (IOException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXuatPDFActionPerformed

    private void tbDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDocGiaMouseClicked
        try {
           

            // hien thi du lieu cua hang da chon trong jTabel
            int row = tbDocGia.getSelectedRow();
            tfMaDocGia.setText((String) tbDocGia.getValueAt(row, 0));
            tfTenDocGia.setText((String) tbDocGia.getValueAt(row, 1));

            String hanSuDung = (String) tbDocGia.getValueAt(row, 2);
            dcHansuDung.setDate(hanSuDung != null && (!hanSuDung.equals("")) ? sdf.parse(hanSuDung) : null);

            String ngaySinh = (String) tbDocGia.getValueAt(row, 3);
            dcNgaySInh.setDate(ngaySinh != null && (!ngaySinh.equals("")) ? sdf.parse(ngaySinh) : null);

            String diaChi = (String) tbDocGia.getValueAt(row, 4);
            tfDiaChi.setText(diaChi != null ? diaChi : null);

            String soDienThoai = (String) tbDocGia.getValueAt(row, 5);
            tfSoDienThoai.setText(soDienThoai != null ? soDienThoai : null);

            String gioiTinh = (String) tbDocGia.getValueAt(row, 6);
            System.out.println(gioiTinh);
            if (gioiTinh.trim().equalsIgnoreCase("Nam")) {
                rbNam.setSelected(true);
            } else {
                rbNu.setSelected(true);
            }

        } catch (ParseException ex) {
            Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbDocGiaMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Bạn muốn sửa dữ liệu ?", "Thêm độc giả", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {

            if (tfMaDocGia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập mã độc giả");
                return;
            }
            if (tfTenDocGia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập tên độc giả");
                return;
            }
            if (!rbNam.isSelected() && !rbNu.isSelected()) {
                JOptionPane.showMessageDialog(this, "Chưa chọn giới tính  độc giả");
                return;
            }

            DocGia docGia = new DocGia();
            docGia.setMaDocGia(tfMaDocGia.getText());
            docGia.setTenDocGia(tfTenDocGia.getText());
            docGia.setDiaChi(tfDiaChi.getText());
            docGia.setSoDienThoai(tfSoDienThoai.getText());
            docGia.setHanSuDung(dcHansuDung.getDate()); ///
            docGia.setNgaySinh(dcNgaySInh.getDate());
            String gioiTinh = "Nam";
            if (rbNam.isSelected()) {
                gioiTinh = "Nam";
            }
            if (rbNu.isSelected()) {
                gioiTinh = "Nữ";
            }
            docGia.setGioiTinh(gioiTinh);

            boolean upd = cdocGia.update(docGia);
            if (upd) {
                JOptionPane.showMessageDialog(this, "Sửa độc giả thành công!");
            }

            loadDataInTable();
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Bạn muốn thêm dữ liệu ?", "Thêm độc giả", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            if (tfMaDocGia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập mã độc giả");
                return;
            }
            if (tfTenDocGia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập tên độc giả");
                return;
            }
            if (!rbNam.isSelected() && !rbNu.isSelected()) {
                JOptionPane.showMessageDialog(this, "Chưa chọn giới tính  độc giả");
                return;
            }

            String sql = "SELECT * FROM DocGia WHERE MaDG = '" + tfMaDocGia.getText() + "'";
            try {
                rs = st.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (!rs.next()) {

                    DocGia docGia = new DocGia();
                    docGia.setMaDocGia(tfMaDocGia.getText());
                    docGia.setTenDocGia(tfTenDocGia.getText());
                    docGia.setDiaChi(tfDiaChi.getText());
                    docGia.setSoDienThoai(tfSoDienThoai.getText());
                    docGia.setHanSuDung(dcHansuDung.getDate()); ///
                    docGia.setNgaySinh(dcNgaySInh.getDate());
                    String gioiTinh = "Nam";
                    if (rbNam.isSelected()) {
                        gioiTinh = "Nam";
                    }
                    if (rbNu.isSelected()) {
                        gioiTinh = "Nữ";
                    }
                    docGia.setGioiTinh(gioiTinh);

                    boolean upd = cdocGia.insert(docGia);
                    if (upd) {
                        JOptionPane.showMessageDialog(this, "Thêm độc giả thành công!");
                    }

                    loadDataInTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Mã độc giả đã tồn tại!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //Hiển thị confirm
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thông báo", OK_CANCEL_OPTION);
        //Nếu chọn Yes
        String sql1 = "SELECT MaDocGiaMuon FROM MuonTra WHERE MaDocGiaMuon = '" + tfMaDocGia.getText().trim() + "'";
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                st = DBConnect.getConnection().createStatement();
                rs = st.executeQuery(sql1);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Doc gia dang muon sach! ");

                } else {
                    DocGia docGia = new DocGia(tfMaDocGia.getText());
                    boolean result = cdocGia.delete(docGia);
                    if (result == true) {
                        JOptionPane.showMessageDialog(this, "Xóa độc giả thành công!");
                    }
                }
                clear();
                loadDataInTable();

            } catch (SQLException ex) {
                Logger.getLogger(GUIQuanLyDocGia.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GioiTinh;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemTuFile;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatBieuMau;
    private javax.swing.JButton btnXuatPDF;
    private javax.swing.JComboBox<String> cbbTimKiem;
    private com.toedter.calendar.JDateChooser dcHansuDung;
    private com.toedter.calendar.JDateChooser dcNgaySInh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbDocGia;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMaDocGia;
    private javax.swing.JTextField tfSoDienThoai;
    private javax.swing.JTextField tfTenDocGia;
    private javax.swing.JTextField tfTimKiem;
    // End of variables declaration//GEN-END:variables
}
