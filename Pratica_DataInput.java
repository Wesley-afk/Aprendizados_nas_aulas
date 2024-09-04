/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_datainput;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author w.rocha
 */
public class Pratica_DataInput {

    public static void main(String[] args) throws IOException {
        DataInputStream []dado; dado = new DataInputStream[5];
        String []a; a = new String[5];
        int []num; num = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero " + (i + 1));
            dado[i] = new DataInputStream(System.in);
            a[i] = dado[i].readLine();
        }
       
        System.out.println("\n");
        for (int o = 0; o < 5; o++) {
            num[o] = (int) Float.parseFloat(a[o]);
            if(num[o] % 2 == 0){
                System.out.println(num[o]);
            }
        }
    }
}
