/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.model;

/**
 *
 * @author dell
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String nxb;
    private String tacGia;
    private String theLoai;
    private float donGia;
    private int soLuong;

    

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach() {
    }

    public Sach(String maSach) {
        this.maSach = maSach;
    }

    
    public Sach(String maSach, String tenSach, String nxb, String tacGia, String theLoai, float donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nxb = nxb;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
//    public Sach(String record){
//        System.out.println(record);
//        String[] values = new String[7];
//        values = record.split("\t");
//        for(String s : values){
//            System.out.println(s);
//        }
//        maSach = values[0];
//        tenSach = values[1];
//        nxb = values[2];
//        tacGia = values[3];
//        theLoai = values[4];
//        donGia = Float.parseFloat(values[5]);
//        soLuong = Integer.parseInt(values[6]);
//    }
    
//    public String[] getValues(){
//        String [] values = new String[7];
//        values[0] = (maSach != null)?maSach : "";
//        values[1] = (tenSach != null) ? tenSach : "";
//        values[2] = (nxb != null)? nxb : "";
//        values[3] = (tacGia != null)? tacGia:"";
//        values[4] = (theLoai != null)? theLoai : "";
//        values[5] = Double.toString(donGia);
//        values[6] = Integer.toString(soLuong);
//        return values;
//        
//    }
}
