/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_swing;

/**
 *
 * @author vuvantu
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private double tienTrongVi;
    private String chuyenNganh;
    private int sDT;

    public SinhVien() {
    }

    public SinhVien(String maSV, double tienTrongVi, String chuyenNganh, int sDT, String hoTen, String diaChi, int tuoi, String queQuan, String gioiTinh) {
        super(hoTen, diaChi, tuoi, queQuan, gioiTinh);
        this.maSV = maSV;
        this.tienTrongVi = tienTrongVi;
        this.chuyenNganh = chuyenNganh;
        this.sDT = sDT;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTienTrongVi(double tienTrongVi) {
        this.tienTrongVi = tienTrongVi;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setsDT(int sDT) {
        this.sDT = sDT;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getTienTrongVi() {
        return tienTrongVi;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getsDT() {
        return sDT;
    }
    public void getInfor() {
        System.out.println( this.maSV + " - " + this.tienTrongVi);
    }

}
