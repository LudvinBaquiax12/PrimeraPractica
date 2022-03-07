/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author baquiax
 */
public class xd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {9, 1, 4, 3, 6, 8, 2, 5, 7, 10};
        System.out.println(repetidos(arr));
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean repetidos(int arr[]) {
        int aux[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            aux[arr[i]-1]++;
            if (aux[arr[i]-1] == 2) {
                return true;
            }
        }
        return false;
    }

}
