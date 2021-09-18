/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

/**
 *
 * @author vuvantu
 */
public class sinhvien extends Person{
    private String maSV;
    private int soTienTrongVi;

    public sinhvien() {
    }

    public sinhvien(String name, int age, String ngheNghiep,String maSV, int soTienTrongVi ){
        super(name, age, ngheNghiep);
          this.maSV = maSV;
        this.soTienTrongVi = soTienTrongVi;
    }

  
    public String getMaSV() {
        return maSV;
    }
    
    public void napTiep(int soTienNap){
        this.soTienTrongVi += soTienNap;
        
    }
    public void truTiep(int soTienTru){
        this.soTienTrongVi -= soTienTru;
    }

    @Override
    public String getThongtin() {
        String info=super.getThongtin()+ " - " + this.maSV + " - " + this.soTienTrongVi;
        return info; 
    }
    
    
    
}
