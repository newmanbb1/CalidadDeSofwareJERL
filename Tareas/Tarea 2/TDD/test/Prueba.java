/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon Ramirez
 */
class Prueba {

  

    public int Respuesta(String esObligatorio, boolean esDocente) {
        int respuesta = 2;
        if (esObligatorio == "si" && esDocente == true) {
            respuesta = 1;
            return respuesta;
        }
        return respuesta;

    }

}
