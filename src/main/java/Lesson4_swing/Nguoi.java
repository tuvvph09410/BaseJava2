/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_swing;

import java.io.Serializable;

/**
 *
 * @author vuvantu
 */
public class Nguoi implements Serializable{

    private String hoTen;
    private String diaChi;
    private int tuoi;
    private String queQuan;
    private String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int tuoi, String queQuan, String gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
