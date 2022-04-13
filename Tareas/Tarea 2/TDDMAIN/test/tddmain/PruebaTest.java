/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tddmain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhon Ramirez
 */
public class PruebaTest {
    
    public PruebaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testsObtenerAccion() {
        String esObligatorio = "si";
        boolean esDocente = true;
        /* boolean exExterno = false;
        String tipoPersonDestino = "docente";
        String estadoRegistro = "externo";*/
        String valorEsperado = "Actualizar";


        Prueba prueba1 = new Prueba();
        String Pruebas = prueba1.Respuesta(esObligatorio, esDocente);
       

        assertEquals(valorEsperado, Pruebas);
  
    }
    
}
