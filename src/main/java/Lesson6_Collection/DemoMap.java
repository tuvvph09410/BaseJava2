/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6_Collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vuvantu
 */
public class DemoMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("lab1", 9);
        map.put("lab2", 10);
        map.put("lab3", 9);

        System.out.println(map);

        map.put("lab2", 9);
        System.out.println(map);

    }

}
