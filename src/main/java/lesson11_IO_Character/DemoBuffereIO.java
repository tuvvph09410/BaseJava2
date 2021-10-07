/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11_IO_Character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vuvantu
 */
public class DemoBuffereIO {

    public static void main(String[] args) {
        String fileName = "demo_file_Charater.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(fileName);
        System.out.println("ghi file thành công");
        System.out.println("----------------");

        System.out.println("Bắt đầu đọc file");
        docFile(fileName);
        System.out.println("Đọc file thành công");
        System.out.println("----------------");
    }

    public static void ghiFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bW = new BufferedWriter(fw);
            String[] list = {
                "Vũ Văn Tú\n",
                "PH09410\n",};

            for (int i = 0; i < list.length; i++) {
                bW.write(list[i]);
            }

            bW.close();

        } catch (IOException IO) {
            IO.printStackTrace();
            System.out.println("Ghi file thất bại");
        }

    }

    public static void docFile(String fileName) {
        try {
            FileReader fR = new FileReader(fileName);
            BufferedReader bR = new BufferedReader(fR);
            while (true) {                
                String txt=bR.readLine();
                if(txt == null ){
                    break;
                }
                System.out.print(txt+"\n");
            }
            System.out.println("");
            bR.close();
        } catch (IOException IO) {
            IO.printStackTrace();
            System.out.println("Đọc file thành công");
        }

    }
}
