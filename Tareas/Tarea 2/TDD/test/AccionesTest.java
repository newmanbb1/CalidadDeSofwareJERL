/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Jhon Ramirez
 */
public class AccionesTest {


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testsObtenerAccion() {
        String esObligatorio = "si";
        boolean esDocente = true;
        /* boolean exExterno = false;
        String tipoPersonDestino = "docente";
        String estadoRegistro = "externo";*/
        int valorEsperado = 1;


        Prueba prueba1 = new Prueba();
        int Pruebas = prueba1.Respuesta(esObligatorio, esDocente);
       

        assertEquals(valorEsperado, Pruebas);
  
    }
}
