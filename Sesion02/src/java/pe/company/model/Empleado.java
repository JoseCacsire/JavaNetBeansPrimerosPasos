/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.company.model;

import java.util.Date;

/**
 *
 * @author JOSE LUIS
 */
public class Empleado {
    
    private Integer id_empleado;
    private String nombre;
    private Date fecha_contrato;
    private String profesion;
    private Double sueldo;

    public Empleado() {}

    public Empleado(Integer id_empleado, String nombre, Date fecha_contrato, 
      String profesion, Double sueldo) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.fecha_contrato = fecha_contrato;
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public String getProfesion() {
        return profesion;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    
}
