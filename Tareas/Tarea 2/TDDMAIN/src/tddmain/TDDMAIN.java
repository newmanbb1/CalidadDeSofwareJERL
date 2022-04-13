/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tddmain;

/**
 *
 * @author Jhon Ramirez
 */
public class TDDMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String esObligatorio = "si";
        boolean esDocente = true;
        /* boolean exExterno = false;
        String tipoPersonDestino = "docente";
        String estadoRegistro = "externo";*/
        int valorEsperado = 1;

        Prueba prueba1 = new Prueba();
        String Pruebas = prueba1.Respuesta(esObligatorio, esDocente);
       

        System.out.println(Pruebas);
  
    }
    
}
