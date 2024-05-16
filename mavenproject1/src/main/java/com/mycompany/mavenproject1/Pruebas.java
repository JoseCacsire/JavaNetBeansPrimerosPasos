/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JOSE LUIS
 */
public class Pruebas {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el primer número : ");
        Integer numero1 = cargarNumero();

        if (numero1 % 2 == 0) {
            System.out.println("Es par");
        }
        else{
            System.out.println("Es Impar");
        }
    }

     private static Integer cargarNumero() throws IOException{
        //    Para cargar elementos del teclado
        InputStreamReader capturarTeclado = new InputStreamReader( System.in ) ;
        BufferedReader buffer = new BufferedReader( capturarTeclado );
        //    Cargando como string
        String strNumero = buffer.readLine();
        //    Convirtiendo string a numero
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
