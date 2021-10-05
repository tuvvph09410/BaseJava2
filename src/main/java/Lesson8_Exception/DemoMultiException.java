/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8_Exception;

/**
 *
 * @author vuvantu
 */
public class DemoMultiException {

    public static void main(String[] args) {
        String[] a = {"1", "2", "abc", "5", null, "6", "7"};

        for (int i = 0; i < 8; i++) {
            try {
                int t = Integer.parseInt(a[i]);
                System.out.println(t);
            } catch (NumberFormatException e) {
                System.out.println("----------------");
                e.printStackTrace();
                System.out.println("----------------");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("----------------");
                e.printStackTrace();
                System.out.println("----------------");
            } catch (Exception e) {
                //throw e;
            }

        }
    }
}
