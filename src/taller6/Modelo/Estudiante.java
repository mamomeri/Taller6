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
public class Estudiante extends PersonalAcademico{

   
    private List<Curso> cursosEstudiante;
    private List<Curso> cursosEstudiante2;

    public Estudiante(List<Curso> cursosEstudiante, List<Curso> cursosEstudiante2, List<Incidente> incidentesAcademicos, String usuario, String contraseña, String nombre, String apellido, List<Incidente> incidentes) {
        super(incidentesAcademicos, usuario, contraseña, nombre, apellido, incidentes);
        this.cursosEstudiante = cursosEstudiante;
        this.cursosEstudiante2 = cursosEstudiante2;
    }

   

    
    public void solicitarInscripcionCurso(Curso curso){

    } 
    public void realizarActividadSumativa(Curso curso,ActividadSumativa  actividadSumativa){

    } 

}
