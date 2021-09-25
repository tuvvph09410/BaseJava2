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

    public void add(Nguoi nguoi);

    public void update(int viTri, Nguoi nguoi);

    public void delete(int viTri);

    public Nguoi get(int viTri);

    public ArrayList<Nguoi> getList();

    public void setList(ArrayList<Nguoi> arrayList);
}
