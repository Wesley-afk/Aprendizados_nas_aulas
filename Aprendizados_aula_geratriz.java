/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendizados_aula_geratriz;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Aprendizados_aula_geratriz {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int num = 0;
     
     System.out.println("Digite um numero");
     num = ler.nextInt();
     
     tabuada(num);
    }
    
    public static void tabuada(int num){
     int []tabuada;
     tabuada = new int[10];
     
     for(int c = 0; c < 10; c++){
       tabuada[c] = num * (c + 1);
       System.out.println(num + " x " + (c + 1) + " " + tabuada[c]);
        }
    }
}
