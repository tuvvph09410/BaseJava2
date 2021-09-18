package Lesson1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vuvantu
 */
public class Person {

    private String name;
    private int age;
    private String ngheNghiep;

    public Person(){}
    public Person(String name, int age, String ngheNghiep) {
        this.name = name;
        this.age = age;
        this.ngheNghiep = ngheNghiep;
    }

   
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getThongtin() {
        String thongtin = this.name + " - " + this.ngheNghiep + " - " + this.age;
        return thongtin;
    }

}
