
package modelo;

/**
 *
 * @author aleja
 */
public class Persona {
    String dni;
    String apellidos;
    String nombres;
    String fechaN;
    String lugarN;
    
    public Persona (){
        dni="";
        apellidos="";
        nombres="";
        fechaN="";
        lugarN="";
        
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getLugarN() {
        return lugarN;
    }

    public void setLugarN(String lugarN) {
        this.lugarN = lugarN;
    }
    
    
}
