/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author JOSE LUIS
 */
@WebService(serviceName = "convertidor")
public class PrimerServicio {
    
    @WebMethod(operationName = "convertidor_a_euros")
     public String convertidor(@WebParam(name = "soles") double soles){
        
         double euros = 4.00;
         
         double resultado = soles / euros;
        
         String resultadoString = String.valueOf(resultado);
         
        return resultadoString + " Euros";
        
    }
}
