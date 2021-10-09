/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12_Mutil_Threading;

/**
 *
 * @author vuvantu
 */
public class MainClass {

    public static void main(String[] args) {
        Thread t1 = new MyThread("Đây là thread 1"),
                t2 = new MyThread("Đây là thread 2");

        t1.start();
        t2.start();
    }

}
