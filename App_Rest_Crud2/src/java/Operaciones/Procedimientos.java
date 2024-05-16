/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;
import  java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author George
 */

public class Procedimientos {
    
    private Connection conect;
    private PreparedStatement sql;
    
    public void InsertarContacto( Directorio d)
    {
        System.out.println("Operaciones.Procedimientos.InsertarContacto()sss");
        try {
            System.out.println("Operaciones.Procedimientos.InsertarContacto()sss");
            conect = Conexion.conex();
            sql = conect.prepareStatement("insert into directorio (id, contacto, email, celular, ciudad) values(?,?,?,?,?) ");
            sql.setInt(1, d.getId());
            sql.setString(2, d.getContacto());
            sql.setString(3, d.getEmail());
            sql.setString(4, d.getCelular());
            sql.setString(5, d.getCiudad());
            
            int n = sql.executeUpdate();
            if(n > 0)
            {
                System.out.println("Registro Guardado");
            }
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    
    }
    
    public void EliminarContacto(int idcontacto)
    {
        try {
            conect = Conexion.conex();
            sql = conect.prepareStatement("delete from directorio where id=?");
            sql.setInt(1, idcontacto);
            int r= sql.executeUpdate();
            if(r > 0)
            {
                System.out.println("Registro Eliminado");
            }
            else
            {
                System.out.println("Error en la Eliminacion");
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    
    }
    
    
    public void ActualizarContacto(Directorio d)
    {
        try {
            conect = Conexion.conex();
            sql = conect.prepareStatement("update directorio set contacto=?, email=?, celular=?, ciudad=? where id=?");
            sql.setString(1, d.getContacto() );
            sql.setString(2, d.getEmail());
            sql.setString(3, d.getCelular());
            sql.setString(4, d.getCiudad());
            sql.setInt(5, d.getId());
            
            int r= sql.executeUpdate();
            if(r> 0)
            {
                System.out.println("Registro Actualizado");
            }
            else
            {
                 System.out.println("Error en la Actualizacion");
            }
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public List<Directorio> listar()
    {
        List<Directorio> items = new ArrayList<Directorio>();
        try {
            conect = Conexion.conex();
            Statement st = conect.createStatement();
            ResultSet tabla = st.executeQuery("select * from directorio");
            
            while(tabla.next())
            {
                Directorio d = new Directorio();
                d.setId(  tabla.getInt("id") );
                d.setContacto(tabla.getString("contacto"));
                d.setEmail(tabla.getString("email"));
                d.setCelular(tabla.getString("celular"));
                d.setCiudad(tabla.getString("ciudad"));
                
                items.add(d);
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return items;
    }
    
    
}

























