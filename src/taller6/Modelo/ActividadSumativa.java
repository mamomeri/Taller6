/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.Modelo;
import java.time.LocalDate;
/**
 *
 * @author CltControl
 */
public abstract class ActividadSumativa {
    protected String titulo;
    protected LocalDate fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;
    private Curso curso;

    public ActividadSumativa(String titulo, LocalDate fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, Curso curso) {
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
        this.curso = curso;
    }
    
    
}
