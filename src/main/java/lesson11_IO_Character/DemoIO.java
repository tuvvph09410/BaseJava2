/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11_IO_Character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuvantu
 */
public class DemoIO {
    
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
            
            FileWriter fileW = new FileWriter(fileName);
            String txt = "Vũ Văn Tú";
            
            List<String> list = new ArrayList<>();
            list.add(txt);
            
            for (int i = 0; i < list.size(); i++) {
                fileW.write(list.get(i));
            }
            
            fileW.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi phải thất bại");
        }
    }
    
    public static void docFile(String fileName) {
        try {
            FileReader fileReader=new FileReader(fileName);
            
            while (true) {                
                int i=  fileReader.read();
                if(i == -1){
                    break;
                }
                
                char c=(char) i;
                System.out.print(c);
            }
          
            System.out.println("");
            
            fileReader.close();
        } catch (IOException ex) {
            System.out.println("Đọc phải thất bại");
        }
        
    }
}
