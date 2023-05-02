/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Sistemas G Didactic
 */
public class Terreno {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costo_terreno;

    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public void calcularCostoTerreno(){
        costo_terreno = valorMetroCuadrado * area;
    }
    
     public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCosto_terreno(){
        return costo_terreno;
    }
}
