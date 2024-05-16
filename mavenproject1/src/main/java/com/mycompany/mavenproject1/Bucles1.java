/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author JOSE LUIS
 */
public class Bucles1 {
    public static void main(String[] args) {
        int a=0;
        int contador=0;
        for (int i = 1; i < 524; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    a++;
                }
            }
            if (a<3){
                System.out.println("primo: "+i);
                contador++;
            }
            a=0;
        }
        System.out.println("total: "+contador+" primos");
    }
}
