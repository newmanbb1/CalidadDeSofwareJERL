/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tddmain;

/**
 *
 * @author Jhon Ramirez
 */
public class Prueba {

    public String Respuesta(String esObligatorio, boolean esDocente) {
        String respuesta = "no paso";
        if (esObligatorio == "si" && esDocente == true) {
            respuesta = "Actualizar";
            return respuesta;
        }
        return respuesta;

    }

    
}
