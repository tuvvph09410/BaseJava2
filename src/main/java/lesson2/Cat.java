/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author vuvantu
 */
public class Cat extends Animal implements RunAble{
    // class cat thực thi interface RunAble
    /*
    class cat sẽ phải triển khai toàn bộ các hàm đã khai báo trong interface RungAble
    */
    
    @Override
    public void run(){
        System.out.println("Running .... ");
    }

    @Override
    public void tiengKeu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
