
package dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Usuario extends Persona implements Serializable{
    //Atributos Usuario
    private ArrayList<Alimento> alimentosIngeridos;
    private ArrayList<Alimento> restricciones;
    
    public Usuario(String nombre, String apellidos, String pais, Date nacimiento, String pathPerfil){
        super(nombre,apellidos,pais,nacimiento,pathPerfil);
        alimentosIngeridos = new ArrayList<Alimento>();
        restricciones = new ArrayList<Alimento>();
    }

}


