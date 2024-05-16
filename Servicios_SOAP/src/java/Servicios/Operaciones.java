/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

//El wdsl tambien es conocido como el contrato del servicio,ya que permite conocer y describir
//como se va a compartar el servicio web desplegado en el servidor.Describe en formato XML

/**
 *
 * @author JOSE LUIS
 */

//Marcando la clase como servicio web
@WebService(serviceName = "Operaciones")
public class Operaciones {
    
    //Marcando este metodo como una operacion del servicio web
    @WebMethod(operationName = "calcular")
    public String calcular(){
        
        int n1,n2,n3,p;
        
        n1=20;
        n2=15;
        n3=18;
        
        p = (n1 +n2 +n3) / 3;
        
        return "El promedio es: " + p;
        
    }
    
    @WebMethod(operationName = "evaluarMayor")
    public String evaluarMayor (@WebParam(name = "n1") int n1,@WebParam(name = "n2") int n2){
        
        String msj = "";
        
        if (n1 > n2) {
            msj = "El mayor es: " + n1;
        }
        
        else if (n2 > n1) {
            msj = "El mayor es: " + n2;
        }
        
        return msj;
        
    }
    
}
