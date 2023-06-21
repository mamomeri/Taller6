/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.Modelo;

import java.util.List;
import taller6.Incidente;

/**
 *
 * @author CltControl
 */
public class Administrador extends Usuario{

    public Administrador(String usuario, String contraseña, String nombre, String apellido, List<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
    }



    public void crearUsuarioConRol(String usuario, String contrasenia ){

    } 

    public void asignarPermiso(String usuario){

    }
    public void actualizarSoftware(){

    } 
    public void asignarResponsable(Curso curso,Profesor responsable ){

    } 
}
