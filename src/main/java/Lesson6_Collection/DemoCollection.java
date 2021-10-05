/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6_Collection;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vuvantu
 */
public class DemoCollection {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(4);
        myList.add(3);
        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(2);
        myList.add(7);

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(4);
        mySet.add(3);
        mySet.add(2);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);

        System.out.println("Giá trị gốc myList & mySet");
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println("-------------------------------------");
        mySet.addAll(myList);
        myList.addAll(mySet);
        System.out.println(myList);
        System.out.println("-------------------------------------");

//        myList.retainAll(mySet); // retainAll duyệt tất cả cách phần từ trong myList và loại bỏ các phần từ không trùng giữa myList mySet;
//        mySet.retainAll(myList);
        Collections.shuffle(myList); // xếp xắp ngẫu nhiên

        System.out.println(myList);

        Comparator comparator = (Comparator) (Object o1, Object o2) -> {
            int i1 = Integer.parseInt(o1.toString());
            int i2 = Integer.parseInt(o2.toString());
            if (i1 < i2) {
                return -1;
            } else if (i1 > i2) {
                return 1;
            }
            return 0;
        };
        Collections.sort(myList, comparator);
        System.out.println(myList);

//        System.out.println(mySet);
//        System.out.println(myList.indexOf(2));
//        System.out.println(myList.lastIndexOf(2));
    }

}
