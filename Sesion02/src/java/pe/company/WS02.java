/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.model.Empleado;

/**
 *
 * @author JOSE LUIS
 */
@WebService(serviceName = "WS02")
public class WS02 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    private static final Collection<Empleado> itemsEmpleado = new ArrayList();

    static {
        //empleados
        Empleado empleado1 = new Empleado(1021,
                "Armando", new GregorianCalendar(2014, 03, 10).getTime(), "Contador", 4000.0);
        Empleado empleado2 = new Empleado(1022,
                "Margarita", new GregorianCalendar(2018, 9, 20).getTime(), "Ingeniero", 6000.0);
        Empleado empleado3 = new Empleado(1023,
                "Basilio", new GregorianCalendar(2015, 1, 8).getTime(), "Arquitecto", 5000.0);
        Empleado empleado4 = new Empleado(1024,
                "Verena", new GregorianCalendar(2019, 11, 21).getTime(), "Obrero", 2000.0);

        //guardar empleados en colección
        itemsEmpleado.add(empleado1);
        itemsEmpleado.add(empleado2);
        itemsEmpleado.add(empleado3);
        itemsEmpleado.add(empleado4);
    }
    
    //operación del web service
    @WebMethod(operationName = "baraja")
    public Collection<Empleado> listarEmpleados(@WebParam(name = "codigo") String codigo) {
        return itemsEmpleado;
    }

    
}
