/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.CaracteristicasEquipoCelulares;

/**
 *
 * @author mpq
 */
public class Ejecutor {
/*  Para un sistema, es necesario abstraer las características de dispositivos 
    electrónicos como los son los Equipo Celulares. Cada Equipo Celular tienen 
    como características: 
    sistema operativo, 
    tamaño de pantalla, 
    costo inicial, 
    iva en porcentaje, 
    iva del costo inicial costo final, 
    dirección mac, 
    información IMEI. 
    El costo final del equipo es igual costo inicial más 
    el iva del costo inicial.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaracteristicasEquipoCelulares[] arrSistema = new CaracteristicasEquipoCelulares[2];
        arrSistema[0] = new CaracteristicasEquipoCelulares();
        arrSistema[1] = new CaracteristicasEquipoCelulares();

        
        for(int i = 0; i < 2; i++) {
            arrSistema[i].establecerSistemaOperativo("Androi");
            arrSistema[i].establecerTPantalla(52.3);
            arrSistema[i].establecerCostoInicial(235.5);
            arrSistema[i].establecerIvaPorcentaje(235.5);
            arrSistema[i].establecerIvaCostoInicial(15.3);
            arrSistema[i].establecerDirecciónMac("00:1B:44:11:3A:B7");
            arrSistema[i].establecerImen("010928 00 389023 3");
            
            arrSistema[i].calcularCostoFinal(
                    arrSistema[i].obtenerCostoInicial(), 
                    arrSistema[i].obtenerIvaCostoInicial());
            
        }

        System.out.println("\t\tListado de Celulares\n\n");
        
        for(int i = 0; i < 2; i++){
            
            System.out.printf("Sistema Operativo:\t%s\n"
                    + "Tamaño de pantalla:\t%s\n"
                    + "Costo Inicial:\t%.2f\n"
                    + "Iva en porcentaje:\t%.2f\n"
                    + "Iva del costo inicial:\t%.2f\n"
                    + "Dirección Mac:\t%s\n"
                    + "IMEN:\t%s\n"
                    + "Costo Final:\t%.2f\n\n",
                    arrSistema[i].obtenerSistemaOperativo(),
                    arrSistema[i].obtenerTPantalla(),
                    arrSistema[i].obtenerCostoInicial(),
                    arrSistema[i].obtenerIvaPorcentaje(),
                    arrSistema[i].obtenerCostoInicial(),
                    arrSistema[i].obtenerDirecciónMac(),
                    arrSistema[i].obtenerImen(),
                    arrSistema[i].obtenerCostoFinal());
        }
        
    }
    
}
