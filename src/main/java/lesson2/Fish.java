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
public class Fish extends Animal implements SwimAble{
    @Override
    public void swim(){
        System.out.println("Swimming.....");
    }

    @Override
    public void tiengKeu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
