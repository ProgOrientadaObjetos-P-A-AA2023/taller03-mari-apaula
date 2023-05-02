/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.AdminitradorColegios;
/**
 *
 * @author mpq
 */
public class Ejecutor {
// Problema 3.
//
// Se necesita representar una entidad que permite 
// administrar Instituciones Educativas. 
// Cada institución tienen como características: 
// nombre, 
//    tipo de institución, 
//    número de alumnos, 
//    número de docentes, 
//    número de sedes, 
//    gastos proyectado por estudiante, 
//    presupuesto. El presupuesto es igual a la cantidad de alumnos de 
// la institución por el gatos proyectado por estudiante.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        AdminitradorColegios[] arrColegio = new AdminitradorColegios[2];
        arrColegio[0] = new AdminitradorColegios();
        arrColegio[1] = new AdminitradorColegios();

        
        for(int i = 0; i < 2; i++) {
            arrColegio[i].establecerNombre("Sanmartín");
            arrColegio[i].establecerTipoinstitucion("Fiscomicional");
            arrColegio[i].establecerNumeroAlumnos(23);
            arrColegio[i].establecerNumeroDocentes(45);
            arrColegio[i].establecerNumeroSedes(56);
            arrColegio[i].establecerGastosEstudiante(23.2);
            
            arrColegio[i].calcularPresupuesto(
                    arrColegio[i].obtenerNumeroAlumnos(), 
                    arrColegio[i].obtenerGastosEstudiante());
            
        }

        System.out.println("\t\tListado de colegios\n\n");
        
        for(int i = 0; i < 2; i++){
            
            System.out.printf("Nombre del colegio:\t%s\n"
                    + "Tipo de intitución:\t%s\n"
                    + "N de alumnos:\t%d\n"
                    + "N de docentes:\t%d\n"
                    + "N de sedes:\t%d\n"
                    + "Gastos por estudiante:\t%.2f\n"
                    + "Presupuesto:\t%.2f\n\n",
                    arrColegio[i].obtenerNombre(),
                    arrColegio[i].obtenerTipoinstitucion(),
                    arrColegio[i].obtenerNumeroAlumnos(),
                    arrColegio[i].obtenerNumeroDocentes(),
                    arrColegio[i].obtenerNumeroSedes(),
                    arrColegio[i].obtenerGastosEstudiante(),
                    arrColegio[i].obtenerPresupuesto());
        }
        
    }
    
}
