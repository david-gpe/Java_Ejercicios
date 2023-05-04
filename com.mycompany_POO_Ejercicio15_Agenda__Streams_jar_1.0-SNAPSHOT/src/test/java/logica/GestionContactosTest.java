package logica;

import beans.Contacto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class GestionContactosTest {
    
    static GestionContactos gestionContactos;
    public GestionContactosTest() {
        gestionContactos=new GestionContactos();
        gestionContactos.agregar("c1", "c1@gmail.com", 10);
        gestionContactos.agregar("c2", "c2@gmail.com", 20);
        gestionContactos.agregar("c3", "c3@gmail.com", 30);
        gestionContactos.agregar("c4", "c4@gmail.com", 40);
        
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
     * Test of agregar method, of class GestionContactos.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        String nombre = "";
        String email = "";
        int edad = 0;
        GestionContactos instance = new GestionContactos();
        boolean expResult = false;
        boolean result = instance.agregar(nombre, email, edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class GestionContactos.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String email = "";
        GestionContactos instance = new GestionContactos();
        Contacto expResult = null;
        Contacto result = instance.buscar(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class GestionContactos.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String email = "";
        GestionContactos instance = new GestionContactos();
        boolean expResult = false;
        boolean result = instance.eliminar(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarContacto method, of class GestionContactos.
     */
    @Test
    public void testRecuperarContacto() {
        System.out.println("recuperarContacto");
        GestionContactos instance = new GestionContactos();
        Contacto[] expResult = null;
        Contacto[] result = instance.recuperarContacto();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarPorEdadMaxima method, of class GestionContactos.
     */
    @Test
    public void testRecuperarPorEdadMaxima() {
        System.out.println("recuperarPorEdadMaxima");
        int edad = 0;
        GestionContactos instance = new GestionContactos();
        Contacto[] expResult = null;
        Contacto[] result = instance.recuperarPorEdadMaxima(edad);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeContacto method, of class GestionContactos.
     */
    @Test
    public void testExisteContacto() {
        assertTrue(gestionContactos.existeContacto("c1"));
        assertFalse(gestionContactos.existeContacto("otro"));
    }

    /**
     * Test of contactoMayor method, of class GestionContactos.
     */
    @Test
    public void testContactoMayor() {
        assertEquals("c4", gestionContactos.contactoMayor().getNombre());
    }

    /**
     * Test of buscarPorNombre method, of class GestionContactos.
     */
    @Test
    public void testBuscarPorNombre() {
        assertNotNull(gestionContactos.buscarPorNombre("c2"));
        assertNotNull(gestionContactos.buscarPorNombre( "no existe"));
    }

    /**
     * Test of recuperarNombres method, of class GestionContactos.
     */
    @Test
    public void testRecuperarNombres() {
        assertEquals(4, gestionContactos.recuperarNombres().size());
    }

    /**
     * Test of edadMedia method, of class GestionContactos.
     */
    @Test
    public void testEdadMedia() {
        assertEquals(25, gestionContactos.edadMedia());
    }
    
}
