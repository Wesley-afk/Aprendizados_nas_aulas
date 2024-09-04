/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_datainput_2;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author w.rocha
 */
public class Pratica_Datainput_2 {

    public static void main(String[] args) throws IOException {
      DataInputStream []dado; dado = new DataInputStream[11];
       String []nuns; nuns = new String[10];
        int []num; num = new int [10];
         int []soma; soma = new int[10];
      
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite numeros inteiros. " + (i + 1));
             dado[i] = new DataInputStream(System.in);
             nuns[i] = dado[i].readLine();
              num[i] = (int) Float.parseFloat(nuns[i]);
        }
        
        for (int i = 0; i < 10; i++) {
         if(num[i] % 2 != 0){
             soma[i] += num[i];
              System.out.println(soma[i]);
         }
        }
    }
}
