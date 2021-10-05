/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10_IO;

import Lesson4_swing.Nguoi;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author vuvantu
 */
public class DemoOjectIOStream {

    public static void main(String[] args) {
        String fileName = "Lession1.txt";

        System.out.println("Bắt đầu ghi file");

        ghiFile(fileName);

        System.out.println("Ghi file Thành Công");
        System.out.println("-------------------");
        System.out.println("Bắt đầu ghi file");

        docFile(fileName);
        System.out.println("đọc file Thành Công");
        System.out.println("-------------------");
    }

    public static void ghiFile(String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream objectOS = new ObjectOutputStream(fos);
            Nguoi n = new Nguoi("Vũ Văn Tú", "Nghệ An", 22, "Nghệ An", "Nam");
            objectOS.writeObject(n);
            objectOS.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }

    }

    public static void docFile(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream objectIS = new ObjectInputStream(fis);

            Nguoi n = (Nguoi) objectIS.readObject();

            System.out.println(n.getHoTen());
            System.out.println(n.getDiaChi());
            System.out.println(n.getTuoi());
            System.out.println(n.getQueQuan());
            System.out.println(n.getGioiTinh());

            objectIS.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Đọc file thất bại");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }

    }
}
