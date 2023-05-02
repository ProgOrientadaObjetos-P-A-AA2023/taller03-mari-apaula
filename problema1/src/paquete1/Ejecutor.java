/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Terreno;
/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {
// Elaborar una solución que calcule e imprima el 
// costo de un terreno rectangular; se tiene como datos 
// el ancho y el largo en metros; el valor del metro 
// cuadrado. El area del terreno es igual a largo por 
// ancho. El costo del terreno es igual al valor del 
// metro cuandrado por el area del terreno. Luego del 
// análisis se decide usar las siguientes entidades:
//
//    Entidades o Clases
//        Terreno
//        Ejecutor
//
//    Terreno, tiene los siguientes atributos
//        costo_terreno
//        ancho
//        largo
//        area
//        valorMetroCuadrado
//
//    Ejecutor
//        Tiene el método main

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Terreno ct = new Terreno();
        
        double largo = 253.45;
        double ancho = 45.66;
        double valorMetroCuadrado = 0.25;
        
        ct.establecerLargo(largo);
        ct.establecerAncho(ancho);
        ct.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        ct.calcularArea();
        ct.calcularCostoTerreno();
        
        System.out.printf("Costo del Terreno\n\nLargo: %.2f\nAncho: %.2f\nValor por metro cuadrado: %.2f\nCon un área de: %.2f\nEl costo a pagar por el terreno: %.2f\n",
                ct.obtenerLargo(),
                ct.obtenerAncho(), 
                ct.obtenerValorMetroCuadrado(),
                ct.obtenerArea(),
                ct.obtenerCosto_terreno());
        
    }
    
}
