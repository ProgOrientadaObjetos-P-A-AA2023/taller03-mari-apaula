/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Sistemas G Didactic
 */
public class CaracteristicasEquipoCelulares {
    /*sistema operativo, 
    tamaño de pantalla, 
    costo inicial, 
    iva en porcentaje, 
    iva del costo inicial costo final, 
    dirección mac, 
    información IMEI. 
    El costo final del equipo es igual costo inicial más 
    el iva del costo inicial.*/
    private String sistemaOperativo;
    private double tPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private String direcciónMac;
    private String imen;
    private double costoFinal;

    public void establecerSistemaOperativo(String c){
        sistemaOperativo = c;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public void establecerTPantalla(double c){
        tPantalla = c;
    }
    
    public double obtenerTPantalla(){
        return tPantalla;
    }
    
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public void establecerIvaPorcentaje(double c){
        ivaPorcentaje = c;
    }
    
    public double obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    
    public void establecerIvaCostoInicial(double c){
        ivaCostoInicial = c;
    }
    
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public void establecerDirecciónMac(String c){
        direcciónMac = c;
    }
    
    public String obtenerDirecciónMac(){
        return direcciónMac;
    }
    
    public void establecerImen(String c){
        imen = c;
    }
    
    public String obtenerImen(){
        return imen;
    }
    
    public void calcularCostoFinal(double c, double d){
        costoFinal = c + d;
//      costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
}
