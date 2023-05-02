/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Sistemas G Didactic
 */
public class AdminitradorColegios {

    private String nombre;
    private String tipoinstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public void establecerNombre(String c){
        nombre = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerTipoinstitucion(String c){
        tipoinstitucion = c;
    }
    
    public String obtenerTipoinstitucion(){
        return tipoinstitucion;
    }
    
    public void establecerNumeroAlumnos(int c){
        numeroAlumnos = c;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public void establecerNumeroDocentes(int c){
        numeroDocentes = c;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public void establecerNumeroSedes(int c){
        numeroSedes = c;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    
    public void establecerGastosEstudiante(double c){
        gastosEstudiante = c;
    }
    
    public double obtenerGastosEstudiante(){
        return gastosEstudiante;
    }
    
    public void calcularPresupuesto(int c, double d){
        presupuesto = c * d;
//      presupuesto = numeroAlumnos * gastosEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
