/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Allan Crack
 */
public class Materia {
    private String titulo;
    private String campo;
    private int horas;

    public Materia(String titulo, String campo, int horas) {
        this.titulo = titulo;
        this.campo = campo;
        this.horas = horas;
    }
 
    public void alumnos(){
        ArrayList<Alumno> alumnos = new  ArrayList<Alumno>();
        Alumno alumno = new Alumno("Carlos", "Sanchez", 12);
        
        alumnos.add(alumno);
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Materia{" + "titulo=" + titulo + ", campo=" + campo + ", horas=" + horas + '}';
    }
    
    
    
}
