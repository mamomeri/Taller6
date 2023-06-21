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
public class PersonalAcademico extends Usuario{

    protected List<Incidente> incidentesAcademicos;

    public PersonalAcademico(List<Incidente> incidentesAcademicos, String usuario, String contraseña, String nombre, String apellido, List<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
        this.incidentesAcademicos = incidentesAcademicos;
    }

   


    public void reportarError(String email,String contenido){

    } 
     public void solicitarAsesoramientoDelSistema(String email,String contenido){

    }
     public void comentarEnForo(Foro foro, String comentario){

    } 
}
