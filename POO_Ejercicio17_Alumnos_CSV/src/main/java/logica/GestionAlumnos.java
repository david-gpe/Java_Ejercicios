package logica;

import beans.Alumno;
import java.util.List;
import java.util.stream.Collectors;
import static logica.AlumnosLocator.alumnos;

public class GestionAlumnos {
    public double notaMedia(String curso){
        return AlumnosLocator.alumnos().filter(a->a.getCurso().equals(curso))
                .mapToDouble(a->a.getNota()).average().orElse(0.0);
    }
    
    public List<Alumno> alumnosCurso(String curso){
        return AlumnosLocator.alumnos().filter(a->a.getCurso().equals(curso))
                .collect(Collectors.toList());
        
    }
    
    public Alumno alumnoNotaMasAlta(){
        return AlumnosLocator.alumnos().max((a,b)->Double.compare(a.getNota(), b.getNota()))
                .orElse(null);
        
    }
    
    public List<String> nombreCursos(){
        return AlumnosLocator.alumnos().map(a->a.getCurso()).distinct().toList();
        
    }
    
}
