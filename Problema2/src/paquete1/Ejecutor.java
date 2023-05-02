/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.EquivalenteHora;
/**
 *
 * @author Sistemas G Didactic
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquivalenteHora eHoras = new EquivalenteHora();
        
        int horas = 26;
        
        eHoras.establecerhoras(horas);
        
        eHoras.calcularMinutos(horas);
        eHoras.calcularSegundos(eHoras.obtenerMinutos());
        eHoras.calcularDias(horas);
        
        
        System.out.printf("\t\tEquivalencia\n%d horas equivale a:\n%d\tminutos\n%d\tsegundos\n%d\tdías\n",
                horas,
                eHoras.obtenerMinutos(),
                eHoras.obtenerSegundos(),
                eHoras.obtenerDias());
        
        
    }
    
}
