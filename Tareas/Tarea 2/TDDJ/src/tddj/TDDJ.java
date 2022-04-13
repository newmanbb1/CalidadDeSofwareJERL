/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tddj;

/**
 *
 * @author Jhon Ramirez
 */
public class TDDJ {

    /**
     * @param args the command line arguments
     */
    static String obtenerAccion(String esObligatorio,Boolean esDocente, Boolean esExterno, String tipoPersonaDestino, String estadoRegistro){
         if("si".equals(esObligatorio) && esDocente==true){
             return "actualizar";
         }else if("no".equals(esObligatorio) && esDocente==true){
             return "matricular";
         }else if(esExterno==true && "porConfirmar".equals(estadoRegistro)){
             return "actualizar";
         }else if(esExterno==true && "externo".equals(tipoPersonaDestino)){
             return "registrar";
         }else if(esExterno==true && "vigente".equals(estadoRegistro)){
             return "matricular";
         }
        return "vacio";
    } 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
