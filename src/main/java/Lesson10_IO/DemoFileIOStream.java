/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10_IO;

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
public class DemoFileIOStream {

    public static void main(String[] args) {
        String fileName = "Lession1.txt";

        System.out.println("Bắt đầu ghi file");

        ghiFile(fileName);

        System.out.println("Ghi file Thành Công");
        System.out.println("-------------------");
        System.out.println("Bắt đầu ghi file");

        docFile(fileName);
        System.out.println("Ghi file Thành Công");
        System.out.println("-------------------");
    }

    public static void ghiFile(String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            String text = "Vũ Văn Tú - PH09410 - Nghệ An";

            byte[] b = text.getBytes();

            fos.write(b);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }

    }

    public static void docFile(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available() != 0) {
                int i = fis.read();
                char c = (char) i;
                System.out.println(c);
            }
            System.out.println("");
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
}
