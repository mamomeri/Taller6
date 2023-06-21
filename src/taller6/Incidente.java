/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import taller6.Modelo.PersonalAcademico;
import taller6.Modelo.Usuario;
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
    private Usuario responsable;
    protected PersonalAcademico beneficiario;
    
    
    
    
    public static void main(String[] args) {
        
        
    }

    
    
}
