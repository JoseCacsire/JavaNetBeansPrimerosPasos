/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "calcularSueldo")
public class SegundoServicio {
    
    @WebMethod(operationName = "calcular")
    public String calcularSueldo(@WebParam(name = "sueldoBruto") double sueldoBruto,
          @WebParam(name = "afp") double afp, @WebParam(name = "sp") double sp) {
          
        double sueldoNeto = sueldoBruto - (sueldoBruto * afp / 100) - (sueldoBruto * sp / 100);
        String mensaje = "Tu sueldo neto es: " + sueldoNeto;
        
        return mensaje;
    }
}