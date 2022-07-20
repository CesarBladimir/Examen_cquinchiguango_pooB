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
public class Empleado extends Persona{
    double sueldoBruto;

    public Empleado() {
    } 

    public Empleado(double sueldoBruto, String nombre, String apellido, String telefono, String correo, int edad, String direccion) {
        super(nombre, apellido, telefono, correo, correo, direccion);
        this.sueldoBruto = sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    @Override
    public String toString() {
        return "el sueldo del empleado es: \n"
                + "sueldobruto: " +getSueldoBruto();
    }

   
//  
    
    
    
    
    
}
