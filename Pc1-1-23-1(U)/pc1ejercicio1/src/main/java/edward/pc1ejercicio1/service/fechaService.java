/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edward.pc1ejercicio1.service;

/**
 *
 * @author javie
 */
public class fechaService {
    public  String validacionFecha(int dia, int mes,int año){
        //Aquí va la validación
        String validacion = "es correcto";
        return validacion;
    }
    
    public static String fechaServicemestre(int mes){
        String trimestre = "";
        
        if(0< mes || mes<4){
            trimestre="Primer trimestre";
        };
        if(4<=mes || mes <=6){
            trimestre="Segundo trimestre";
        };
        if(7<=mes || mes <=9){
            trimestre="Tercer trimestres";
        };
        if(10<= mes || mes <=12){
            trimestre = "Cuarto trimestre";
        };
        
        return trimestre;
    }
    
    public String encontrarEstacion(int día, int mes){
        //Otoño: 20/03
        //Invierno: 20/06
        //Primavera: 22/09
        //Verano:21/12
        
        String estacion="invierno";
        
        
        return estacion;
    }
}
