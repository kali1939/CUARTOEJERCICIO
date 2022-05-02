package programa05proyectopoo;

public class Cuenta {

    private String nombre;
    private String apellido;
    private int edad;
    private double cantidad;

    public Cuenta(String nombre, String apellido, int edad, double cantidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    Object setApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
    
    
    
    
    
    
    
    
}
