/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
/**
 *
 * @author DELL
 */
public class Incidente {


    protected int id;
    protected LocalDate  fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDate fecha_cerrado;
    protected String tipo;

    
    
    public Incidente() {
        log_actualizaciones  = new ArrayList<String>();
    }
    
    
    
    public static void main(String[] args) {
        
        
    }
    
}
