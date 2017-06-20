/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.model;

import java.util.Date;
import java.util.GregorianCalendar;
import qltv.util.CalendarAdapter;

/**
 *
 * @author dell
 */
public class DocGia {
    private String maDocGia;
    private String tenDocGia;
    private Date hanSuDung;
    private Date ngaySinh;
    private String diaChi;
    private String soDienThoai;
    private String gioiTinh;

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public DocGia(){};

    public DocGia(String maDocGia, String tenDocGia, Date hanSuDung, Date ngaySinh, 
                  String diaChi, String soDienThoai, String gioiTinh) {
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.hanSuDung = hanSuDung;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
    }
    
    
   

//    public String [] getValues(){
//        String [] values = new String[7];
//        
//        values[0] = (maDocGia!=null)?maDocGia:"";
//        values[1] = (tenDocGia!=null)?tenDocGia:"";
//        values[2] = (String)((hanSuDung != null)?hanSuDung : "");
//        values[3] = (String)((ngaySinh != null)?ngaySinh : "");
//        values[4] = (diaChi != null) ? diaChi:"";
//        values[5] = (soDienThoai != null) ? soDienThoai : "";
//        values[6] = (gioiTinh != null ) ? gioiTinh : "";
//        
//        return values;
//    }
//    
//    public DocGia(String record){
//        String [] values = new String[7];
//        values = record.split("\t");
//        maDocGia = values[0];
//        tenDocGia = values[1];
//        hanSuDung = CalendarAdapter.StringToDate(values[2]);
//        ngaySinh = CalendarAdapter.StringToDate(values[3]);
//        diaChi = values[4];
//        soDienThoai = values[5];
//        gioiTinh = values[6];      
//    }

    public DocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }
   
    
    
}
