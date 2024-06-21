package loginfx;

public class usuario {
    
    // VARIBALES

    private String nombre;
    private String contrasena;

    // CONTRUCTORES

    public usuario (String nombre, String contrasena) {

        this.nombre = nombre;
        this.contrasena = contrasena;

    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getConsetrena() {
        return contrasena;
    }
    public void setConsetrena(String consetrena) {
        this.contrasena = consetrena;
    }

}
