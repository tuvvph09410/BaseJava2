/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuvantu
 */
public class DemoDataIOStream {

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

            DataOutputStream dataFos = new DataOutputStream(fos);

            double giatien = 10.05;
            char c = 'B';
            dataFos.writeDouble(giatien);
            dataFos.writeChar(c);
            
            dataFos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }

    }

    public static void docFile(String fileName) {
        try {
            FileInputStream fis= new FileInputStream(fileName);
              DataInputStream dataIS=new DataInputStream(fis);
              double d=dataIS.readDouble();
              char c =dataIS.readChar();
              
              System.out.println(d);
               System.out.println(c);
              
              dataIS.close();
        } catch (IOException ex) {
              ex.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
      

    }
}
