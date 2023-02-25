/*

        
 */
package proyecto1;
import java.util.ArrayList;

public class clienteArreglo {
    private String correo;
    private String contra;
    private String nombre;
    private String rol;
    private String NIT;
    
    public clienteArreglo(){
        correo = new String();
        contra = new String();
        nombre = new String();
        rol = new String();
        NIT = new String();
    }
    
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getContra(){
        return contra;
    }
    public void setContra(String contra){
        this.contra = contra;
    }
        
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
    public String getNIT(){
        return NIT;
    }
    public void setNIT(String NIT){
        this.NIT = NIT;
    }
}
