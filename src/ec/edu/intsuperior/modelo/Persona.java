/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Windows 10
 */
public class Persona {
   private String nombre;
   private String apellido;
   private String telefono;
   private String correo;
   private String edad;
   private String direccion;
   private String sueldo;
   
   public Persona (){
       
   }    

    public Persona(String nombre, String apellido, String telefono, String correo, String edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.edad= edad;
        this.direccion = direccion;
        this.sueldo= sueldo;
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(String edad) {
        this.edad= edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    public String getSueldo() {
        return sueldo;

    }

    
   @Override
    public String toString() {
        return "Los tipos de datos son: \n "
                + "apellidos y nombres : " + getNombre()+ "\n"
                + " "+ " " + getApellido()
                + "Direcion: " + getCorreo()+ "\n"
                + "Celular: " + getDireccion()+ "\n"
                + "Correo: " + getTelefono()+ "\n"
                + "Edad: " + getEdad()+"\n"
                +"sueldoBruto: " + getSueldo();
        
}
}

