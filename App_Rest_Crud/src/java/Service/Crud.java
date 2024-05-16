/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package Service;

import Operaciones.Directorio;
import Operaciones.Procedimientos;
import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author George
 */
@Path("/service")
public class Crud {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Crud
     */
    public Crud() {
    }

    Procedimientos pro = new Procedimientos();
    
    
    @Path("/create")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Guardar(Directorio d)
    {
        pro.InsertarContacto(d);
        return Response.ok().entity(d).build();
    }
    
    
    
    @Path("/delete")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void Borrar(  @QueryParam("id") int id )
    {
        pro.EliminarContacto(id);
    }
    
    
    @Path("/read")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Directorio> mostrar()
    {
        return  pro.listar();
    }
    
    
    
    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizar(Directorio d)
    {
        pro.ActualizarContacto(d);
        return Response.ok().entity(d).build();
    }
    
    
    

   
}











