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
@Path("service/operaciones")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
        
    }
    
    @Path("create")
    @POST
   public String GuardarCliente() //Crear un Recurso
   { 
       
       return "Cliente guardado";
   }
    
   @Path("update")
   @PUT
    public String ActualizarCliente() //Actualizar un Recurso
   { 
       
       return "Cliente actualizado";
   }
    
    @Path("update/categoria")
    @PUT
    public String ActualizarCategoriaCliente() //Actualizar un Recurso
   { 
       
       return "Categoria Cliente Actualizado";
   }
}
