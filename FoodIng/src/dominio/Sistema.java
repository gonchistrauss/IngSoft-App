package dominio;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public Sistema() {
        listaUsuarios = new ArrayList<Usuario>();
        listaProfesionales = new ArrayList<Profesional>();
    }

    public void agregarUsuario(String nombre, String apellidos, String nacionalidad, Date nacimiento, String pathPerfil) {
        Usuario nuevoUsuario = new Usuario(nombre, apellidos, nacionalidad, nacimiento, pathPerfil);
        this.getListaUsuarios().add(nuevoUsuario);
    }

    public void agregarProfesional(String nombre, String apellidos, String nacionalidad, Date nacimiento, String pathPerfil, String titulo,String paisTitulo,Date fechaGrad) {
        Profesional nuevoProfesional = new Profesional(nombre,apellidos,nacionalidad,nacimiento,pathPerfil,titulo,fechaGrad,paisTitulo);
        this.getListaProfesionales().add(nuevoProfesional);
    }
}
