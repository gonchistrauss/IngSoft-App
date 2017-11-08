package dominio;

import java.io.Serializable;
import java.util.*;

public abstract class Persona implements Serializable {

    //Atributos de Persona
    private String nombre;
    private String apellidos;
    private Locale nacionalidad;
    private Date fechaDeNacimiento;
    private String pathPerfil;
    private ArrayList<Consulta> consultas;
    //private String mail;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Locale getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String countryCode) {
        this.nacionalidad = new Locale("", countryCode);
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getPathPerfil() {
        return pathPerfil;
    }

    public void setPathPerfil(String perfil) {
        this.pathPerfil = perfil;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void agregarConsulta(Consulta nuevaConsulta) {
        this.consultas.add(nuevaConsulta);
        nuevaConsulta.setId(consultas.size());
    }

    public Persona(String nombre, String apellidos, String countryCode, Date fechaDeNacimiento, String perfil) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setNacionalidad(countryCode);
        this.setFechaDeNacimiento(fechaDeNacimiento);
        this.setPathPerfil(perfil);
        consultas = new ArrayList<Consulta>();
    }

    public Persona() {
        this.setNombre("");
        this.setApellidos("");
        this.setNacionalidad("");
        this.fechaDeNacimiento = new Date();
        this.setPathPerfil("/imagenes/avatar.png");
        consultas = new ArrayList<Consulta>();
    }

}
