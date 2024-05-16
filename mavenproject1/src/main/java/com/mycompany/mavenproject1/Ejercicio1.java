
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el primer número : ");
        Integer numero1 = cargarNumero();

        System.out.println(" Ingrese el segundo número : ");
        Integer numero2 = cargarNumero();


        System.out.println(" Ingrese el tercer número : ");
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio= sumatoria*1.0/3;
        System.out.println("El número promedio es: "+numeroPromedio);
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
