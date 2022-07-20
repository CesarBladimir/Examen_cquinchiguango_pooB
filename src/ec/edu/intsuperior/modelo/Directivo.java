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
public class Directivo extends Empleado{
    private String Directivo;
    
    public Directivo (){
    
    }

    public Directivo(String Directivo, double sueldoBruto, String nombre, String apellido, String telefono, String correo, int edad, String direccion) {
        super(sueldoBruto, nombre, apellido, telefono, correo, edad, direccion);
        this.Directivo = Directivo;
    }

    public void setDirectivo(String Directivo) {
        this.Directivo = Directivo;
    }

    public String getDirectivo() {
        return Directivo;
    }

    @Override
    public String toString() {
        return "Directivo: \n"
                + "Tipo de directivo: "+getDirectivo();  //To change body of generated methods, choose Tools | Templates.
    }

    
}
