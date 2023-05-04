package beans;

public class Contacto {
    private String email;
    private String nombre;
    private Integer edad;
    
    public Contacto(String nombre, String email, int edad){
        super();
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
