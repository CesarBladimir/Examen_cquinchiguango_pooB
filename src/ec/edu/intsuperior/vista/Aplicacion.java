package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;
        

public class Aplicacion {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Cliente();
        
        
       
        p1.setNombre(JOptionPane.showInputDialog("Ingresa Nombre: "));
        p1.setApellido(JOptionPane.showInputDialog("Ingresa Apellido:  "));
        p1.setCorreo(JOptionPane.showInputDialog("Ingresa Correo  "));
        p1.setDireccion(JOptionPane.showInputDialog("Ingresa Direccion "));
        p1.setTelefono(JOptionPane.showInputDialog("Ingresa Telefono  "));
       
        {
        JOptionPane.showMessageDialog(null, p1.toString());
        }
    
    String nombre=JOptionPane.showInputDialog("Nombre del trabajador");
    String profesion=JOptionPane.showInputDialog("Profesion");
    
int dl=Integer.parseInt(JOptionPane.showInputDialog("Dias Laborados"));
double pd=Double.parseDouble(JOptionPane.showInputDialog("Pago por dia"));
     
     double sb=0,aux;

 //Para conocer el salario bruto
        if(dl>30){
            double tn=15*pd;
           
            double sx=(pd*15);
            sb=sx+tn;
        }else{
            sb=dl*pd;
        }
     JOptionPane.showMessageDialog(null,"Trabajador: "+nombre+"\n"
             + "Profesion: "+profesion+"\n"
                     +"Dias trabajdos: "+dl+"\n"
             + "Sueldo bruto: "+sb+"\n");
        
   } 
    
}
