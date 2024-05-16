/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JOSE LUIS
 */
//Marcar esta clase como servicio web
@WebService(serviceName = "operaciones")
public class Operaciones {
    //Operacion del servicio web
    @WebMethod(operationName="saludar")
    //Parametro del servicio web
    public String saludar(@WebParam(name = "msj") String msj)
    {
        return "Mensaje :" +msj;
    }
}
