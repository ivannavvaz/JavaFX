package agendafx;

public class empleado {

    // VARIABLES
    
    private String idEmpleado;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String fechaNacimiento;
    private String Cargo;

    // CONSTRUCTOR

    public empleado(String idEmpleado, String nombre, String apellidos, String telefono, String fechaNacimiento,
            String cargo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        Cargo = cargo;
    }

    // GETTERS Y SETTERS

    public String getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    // TO STRING

    @Override
    public String toString() {

        return "IdEmpleado: " + getIdEmpleado() + ", Nombre: " + getNombre() + ", Apellidos: " + getApellidos() + ", Telefono: " + getTelefono() + ", FechaNacimiento: " + getFechaNacimiento() + ", Cargo: " + getCargo();

    }

}
