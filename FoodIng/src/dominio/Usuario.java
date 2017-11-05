package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Usuario extends Persona implements Serializable {

    //Atributos Usuario
    private ArrayList<Alimento> alimentosIngeridos;
    private ArrayList<Alimento> restricciones;
    //ArrayList<Alimento>[] recordAnual;

    public ArrayList<Alimento> getAlimentosIngeridos() {
        return alimentosIngeridos;
    }

    public ArrayList<Alimento> getRestricciones() {
        return restricciones;
    }

    public void agregarAlimento(Alimento nuevoAlimento){
        this.alimentosIngeridos.add(nuevoAlimento);
    }
    
    public void agregarRestriccion(Alimento nuevaRestriccion){
        this.restricciones.add(nuevaRestriccion);
    }
    
    public Usuario(String nombre, String apellidos, String pais, Date nacimiento, String pathPerfil) {
        super(nombre, apellidos, pais, nacimiento, pathPerfil);
        alimentosIngeridos = new ArrayList<Alimento>();
        restricciones = new ArrayList<Alimento>();
    }

}
