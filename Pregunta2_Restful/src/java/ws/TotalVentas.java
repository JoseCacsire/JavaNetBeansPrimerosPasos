/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author JOSE LUIS
 */
@Path("totalVentas")
public class TotalVentas {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TotalVentas
     */
    public TotalVentas() {

    }

    @Path("tresVentas")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText(@QueryParam("venta1") double venta1,
            @QueryParam("venta2") double venta2,
            @QueryParam("venta3") double venta3) {
        double totalVentas = venta1 + venta2 + venta3;
        double comision = 0;

        if (totalVentas > 12000) {
            // Aplicar comisión del 4%
            comision = totalVentas * 0.04;
        }

        double totalConComision = totalVentas + comision;

        // Crear la cadena de texto con la información
        String result = "Total de Ventas: S/" + totalVentas + "\n";
        result += "Comision: S/" + comision + "\n";
        result += "Total de Ventas con Comision: S/" + totalConComision;

        return result;
    }

}
