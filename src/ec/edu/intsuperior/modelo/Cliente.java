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
public class Cliente extends Persona{
    private String Telefonocontacto;
    
    public Cliente (){
    }

    public Cliente(String Telefonocontacto, String nombre, String apellido, String telefono, String correo, int edad, String direccion) {
        super(nombre, apellido, telefono, correo, correo, direccion);
        this.Telefonocontacto = Telefonocontacto;
    }

    public void setTelefonocontacto(String Telefonocontacto) {
        this.Telefonocontacto = Telefonocontacto;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
    

