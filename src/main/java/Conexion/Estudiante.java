
package Conexion;


public class Estudiante {
    
    private int idestudiante;
    private String nombre;
    private String apellidos;
    private String fechanac;
    private String correo;
    private String genero;

    public Estudiante(int idestudiante, String nombre, String apellidos, String fechanac, String correo, String genero) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanac = fechanac;
        this.correo = correo;
        this.genero = genero;
    }


    public Estudiante() {
        this.idestudiante = 0;
        this.nombre = "";
        this.apellidos = "";
        this.fechanac = "";
        this.correo = "";
        this.genero = "";
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
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

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
   
   
}
