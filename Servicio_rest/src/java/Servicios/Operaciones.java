/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package Servicios;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author JOSE LUIS
 */
@Path("operaciones")
public class Operaciones {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Operaciones
     */
    public Operaciones() {
    }

    /**
     * Retrieves representation of an instance of Servicios.Operaciones
     * @return an instance of java.lang.String
     */
    
    //Este metodo va a recibir los datos q van a ser seteados en la clase persona.Osea
    //los atributos con sus valores.
    @Path("create")
    @POST
    //En q formato voy  mandar los datos que seria JSON
    @Consumes(MediaType.APPLICATION_JSON)
    //Como voy a recibir los datos q seria JSON
    @Produces(MediaType.APPLICATION_JSON)
    public Persona guardarPersona(Persona p) {
        
        return p;
    }

    /**
     * PUT method for updating or creating an instance of Operaciones
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
