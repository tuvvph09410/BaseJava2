/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_swing;

import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public interface QLDanhSachSV_Interface {

    public void reSet();

    public void add(SinhVien sinhVien);

    public void update(int viTri, SinhVien sinhVien);

    public void delete(int viTri, SinhVien sinhVien);

    public SinhVien get(int viTri);

    public ArrayList<SinhVien> getList();

    public void setList(ArrayList<SinhVien> arrayListSV);
}
