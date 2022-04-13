/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tddj;

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
public class TDDJTest {

    public TDDJTest() {
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

    /**
     * Test of obtenerAccion method, of class Tarea2.
     */
//a)	Si es obligatorio y es docente devolver: actualizar.
//b)	Si no es obligatorio y es docente devolver: matricular 
//c)	Si es externo y estado registro por Confirmar entonces: actualizar
//d)	Si es externo y destinatario externo entonces: registrar   
//e)	Si es externo y estado de registro vigente: matricular
    @Test
    public void testObtenerAccion_a() {

        String esObligatorio = "si";
        Boolean esDocente = true;
        Boolean esExterno = null;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";
        String expResult = "actualizar";

        String result = TDDJ.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
        System.out.println("obtenerAccion A:" + "ACTUALIZAR");
    }

    @Test
    public void testObtenerAccion_b() {

        String esObligatorio = "no";
        Boolean esDocente = true;
        Boolean esExterno = null;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";
        String expResult = "matricular";
        String result = TDDJ.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
        System.out.println("obtenerAccion B:" + "MATRICULAR");
    }

    @Test
    public void testObtenerAccion_c() {

        String esObligatorio = "";
        Boolean esDocente = null;
        Boolean esExterno = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "porConfirmar";
        String expResult = "actualizar";
        String result = TDDJ.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
        System.out.println("obtenerAccion C:" + "ACTUALIZAR");
    }

    @Test
    public void testObtenerAccion_d() {

        String esObligatorio = "";
        Boolean esDocente = null;
        Boolean esExterno = true;
        String tipoPersonaDestino = "externo";
        String estadoRegistro = "";
        String expResult = "registrar";
        String result = TDDJ.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
        System.out.println("obtenerAccion D:" + "REGISTRAR");
    }

    @Test
    public void testObtenerAccion_e() {

        String esObligatorio = "";
        Boolean esDocente = null;
        Boolean esExterno = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "vigente";
        String expResult = "matricular";
        String result = TDDJ.obtenerAccion(esObligatorio, esDocente, esExterno, tipoPersonaDestino, estadoRegistro);
        assertEquals(expResult, result);
        System.out.println("obtenerAccion E:" + "MATRICULAR");
    }

}
