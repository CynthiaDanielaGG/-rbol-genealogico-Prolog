/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARUMI
 */
public class Alumno {
    private int id;
    private String nombre;
    private String ApellidoP;
    private String apellidoA;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String ApellidoP, String apellidoA) {
        this.id = id;
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.apellidoA = apellidoA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoA() {
        return apellidoA;
    }

    public void setApellidoA(String apellidoA) {
        this.apellidoA = apellidoA;
    }
    
}
