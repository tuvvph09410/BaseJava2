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
public abstract class Animal {

    private String name;
    private String color;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // hàm không có thực thi chi tiết được gọi là abstract và khai báo hàm với abstract
    // trong class có hàm abstract thì class đó gọi là class abstract và khai báo class với abstact
    abstract public void tiengKeu();

}
