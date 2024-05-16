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
@WebService(serviceName = "Operaciones")
public class SegundoServicio {
    
    @WebMethod(operationName = "validarUsuario")
    public String validar(@WebParam(name = "usuario") String usuario,@WebParam(name = "clave") String clave){
        String msj = "Usuario incorrecto";
        if ("@idat".equals(usuario) && "@inlearning".equals(clave)) {
            msj = "Usuario correcto";
        }
        return msj;
        
    }
}
