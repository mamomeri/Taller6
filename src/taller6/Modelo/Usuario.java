/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.Modelo;

import java.util.ArrayList;
import java.util.List;
import taller6.Incidente;

/**
 *
 * @author CltControl
 */
public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected List<Incidente> incidentes;

    public Usuario(String usuario, String contraseña, String nombre, String apellido, List<Incidente> incidentes) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentes = incidentes;
    }
    
   
    protected boolean logIn(){
    
        return true;
    }
    protected boolean logOut(){
    
        return true;
    }
}
