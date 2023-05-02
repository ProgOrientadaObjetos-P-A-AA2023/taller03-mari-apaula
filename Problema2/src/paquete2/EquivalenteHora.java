/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Sistemas G Didactic
 */
public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    public void establecerhoras(int c){
        horas = c;
    }
    
    public int obtenerHoras(){
        return horas; 
    }
    
    public void calcularMinutos(int c){
        minutos = c * 60;
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public void calcularSegundos(int c){
        segundos = c * 60;
    }
    
    public int obtenerSegundos(){
        return segundos;
    }
    
    public void calcularDias(int c){
        dias = c / 24;
    }
   
    public int obtenerDias(){
        return dias;
    }
    
}
