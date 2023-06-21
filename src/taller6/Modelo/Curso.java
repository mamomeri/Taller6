/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.Modelo;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
   
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private List<Foro> foros;
    private List<ActividadSumativa> actividadesSumativas;

    public Curso(String id, String nombre, boolean estadoDisponible, Profesor responsable, List<Estudiante> estudiantesInscritos, List<Estudiante> estudiantesEnEsperaDeInscripcion, List<Foro> foros, List<ActividadSumativa> actividadesSumativas) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.responsable = responsable;
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.foros = foros;
        this.actividadesSumativas = actividadesSumativas;
    }
    
}
