/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Maestro {
     private String nombreAlumno;
    private String Apellido;
    private int edad;
    private double sueldo;

    public Maestro(String nombreAlumno, String Apellido, int edad, double sueldo) {
        this.nombreAlumno = nombreAlumno;
        this.Apellido = Apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Maestro{" + "nombreAlumno=" + nombreAlumno + ", Apellido=" + Apellido + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
    
    
}
