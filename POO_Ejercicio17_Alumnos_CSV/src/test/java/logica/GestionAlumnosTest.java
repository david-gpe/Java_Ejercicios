package logica;

import beans.Alumno;
import logica.GestionAlumnos;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestionAlumnosTest {
    
    static GestionAlumnos gestionAlumnos;
    
    public GestionAlumnosTest() {
    }
    @BeforeAll
    public static void setUpClass() {
        gestionAlumnos=new GestionAlumnos();
    }
    

    @Test
    public void testNotaMedia() {
        assertEquals(6.75, gestionAlumnos.notaMedia("Java"));
        assertEquals(6.4, gestionAlumnos.notaMedia("Python"),0.1);
    }

    @Test
    public void testAlumnosCurso() {
        assertEquals(3, gestionAlumnos.alumnosCurso("Python").size());
        assertEquals(0, gestionAlumnos.alumnosCurso("Angular").size());
    }


    @Test
    public void testAlumnoNotaMasAlta() {
        assertEquals("a3", gestionAlumnos.alumnoNotaMasAlta().getNombre());
    }

    @Test
    public void testNombreCursos() {
        assertEquals(3, gestionAlumnos.nombreCursos().size());
    }
    
}
