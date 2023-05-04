package logica;

import beans.Alumno;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author gpema
 */
public class AlumnosLocator {
    private static String ruta="C:\\Users\\gpema\\OneDrive\\Escritorio\\Cursos\\Curso POO\\alumnos.csv";
    public static Stream<Alumno> alumnos(){
        Path pt=Paths.get(ruta);
        try{
            return Files.lines(pt).map(s->{
                String []datos=s.split("[,]");
                return new Alumno(datos[0], datos[1],Double.parseDouble(datos[2]));
            });   
        }catch(IOException ex){
            ex.printStackTrace();
            return Stream.empty();
        }
    }
}
