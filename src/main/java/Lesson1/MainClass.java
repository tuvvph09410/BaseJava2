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
public class MainClass {
   
    public static void main(String[] args) {
        Person p; // khai báo biến p thuộc kiểu Person;
        
        // khởi tạo đối tượng sinhvien & gán vào biến p
        p = new sinhvien("Vu Van Tu", 23 , "sinh Vien" ," PH09410 " ,20924);
        System.out.println(p.getThongtin());
        
        
    }
}
