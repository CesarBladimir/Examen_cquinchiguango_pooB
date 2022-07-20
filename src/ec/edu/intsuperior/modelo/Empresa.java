
package ec.edu.intsuperior.modelo;


public class Empresa extends Persona{
    private String NombreEmpresa;
    
    public Empresa (){
    }

    public Empresa(String NombreEmpresa, String nombre, String apellido, String telefono, String correo, int edad, String direccion) {
        super(nombre, apellido, telefono, correo, correo, direccion);
        this.NombreEmpresa = NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    @Override
    public String toString() {
        return "nombre empresa: "
        + "El Nombre de la Empresa es: \n" +getNombreEmpresa();
                
    }
    
}
