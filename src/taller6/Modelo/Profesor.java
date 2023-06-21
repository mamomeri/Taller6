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
public class Profesor extends PersonalAcademico{

   
    private List<Curso> cursosACargo;

    public Profesor(List<Curso> cursosACargo, List<Incidente> incidentesAcademicos, String usuario, String contraseña, String nombre, String apellido, List<Incidente> incidentes) {
        super(incidentesAcademicos, usuario, contraseña, nombre, apellido, incidentes);
        this.cursosACargo = cursosACargo;
    }

    
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){

    } 
    public void calificarActividadSumativa(Curso curso,Estudiante estudiante,ActividadSumativa actividadSumativa){

    } 
     public void aceptarInscripcion(Curso curso, String usuarioEstudiante){

    } 
    public void crearNuevoForo(Foro foro){

    } 
    
}
