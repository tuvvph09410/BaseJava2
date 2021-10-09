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
public class DemoRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("Vu Van Tu");
    }

    public static void main(String[] args) {
        Runnable r = new DemoRunable(),
                r1 = new DemoRunable();

        Thread t = new Thread(r),
                t2 = new Thread(r1);

        t.start();
        t2.start();
    }

}
