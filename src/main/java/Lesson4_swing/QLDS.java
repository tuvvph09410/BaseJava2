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
public class QLDS implements QLDanhSachSV_Interface {

    private ArrayList<Nguoi> arrayList;

    public QLDS() {
        this.arrayList = new ArrayList<>();
    }

    public QLDS(ArrayList<Nguoi> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(Nguoi nguoi) {
        this.arrayList.add(nguoi);
    }

    @Override
    public void update(int viTri, Nguoi nguoi) {
        this.arrayList.set(viTri, nguoi);
    }

    @Override
    public void delete(int viTri) {
        this.arrayList.remove(viTri);
    }

    @Override
    public Nguoi get(int viTri) {
        return this.arrayList.get(viTri);
    }

    @Override
    public ArrayList<Nguoi> getList() {
        return this.arrayList;
    }

    @Override
    public void setList(ArrayList<Nguoi> arrayList) {
        this.arrayList = arrayList;
    }

}
