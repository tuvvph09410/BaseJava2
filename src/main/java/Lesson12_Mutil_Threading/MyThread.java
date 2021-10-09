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
public class MyThread extends Thread {

    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        System.out.println(this.message);
    }

}
