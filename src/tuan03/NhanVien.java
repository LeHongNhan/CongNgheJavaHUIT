/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan03;

/**
 *
 * @author nhang
 */
public class NhanVien {

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien(String ma, String ten, String ngayVaoLam, String namSinh, String phongBan) {
        this.ma = ma;
        this.ten = ten;
        this.ngayVaoLam = ngayVaoLam;
        this.namSinh = namSinh;
        this.phongBan = phongBan;
    }

    public NhanVien() {
    }
    
    private String ma;
    private String ten;
    private String ngayVaoLam;
    private String namSinh;
    private String phongBan;    

    @Override
    public String toString() {
        return ten; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    

}
