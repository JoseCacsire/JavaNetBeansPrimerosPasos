/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JOSE LUIS
 */
public class Funciones {

    public static void main(String[] args) throws IOException {

//    -----------------------------------------------------------------------
    System.out.println("Ingrese el primer número : ");
    Integer numero1 = cargarNumero();
    
    System.out.println(" Ingrese el segundo número : ");
    Integer numero2 = cargarNumero();
    
    
    System.out.println(" Ingrese el tercer número : ");
    Integer numero3 = cargarNumero();
    
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }
    
//    Esta funcion si me pide retornar un numero ya q se usa una clase especificando q tipo de dato debe 
//    retornar
    
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
//    Este comentario de abajo me ayuda a especificar mi funcion y q parametros pide
    /**
     * Está funcion sirve para calcular el numero mayor
     * @param numero1 es el primer numero
     * @param numero2 es el segundo numero
     * @param numero3 es el tercer numero
     */
//    El void significa que no me devuelve nada osea q no se usa return
    private static void calcularNumeroMayor(Integer numero1,Integer numero2,Integer numero3){
        Integer numeroMayor=numero1;
        if (numero2>numeroMayor) {
            numeroMayor=numero2;
        }
        if (numero3>numeroMayor){
            numeroMayor=numero3;
        }
        System.out.println("El numero mayor es: "+numeroMayor);
            
        }
    private static void calcularNumeroMenor(Integer numero1,Integer numero2,Integer numero3){
        Integer numeroMenor=numero1;
        if (numero2<numeroMenor) {
            numeroMenor=numero2;
        }
        if (numero3<numeroMenor){
            numeroMenor=numero3;
        }
        System.out.println("El numero menor es: "+numeroMenor);
    }
}

