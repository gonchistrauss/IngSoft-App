package dominio;

import java.util.*;
import java.io.Serializable;
public class Profesional extends Persona implements Serializable {

    private String tituloProfesional;
    private Date fechaDeGraduacion;
    private Locale paisEstudio;

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public Date getFechaDeGraduacion() {
        return fechaDeGraduacion;
    }

    public void setFechaDeGraduacion(Date fechaDeGraduacion) {
        this.fechaDeGraduacion = fechaDeGraduacion;
    }

    public Locale getPaisEstudio() {
        return paisEstudio;
    }

    public void setPaisEstudio(String countryCode) {
        this.paisEstudio = new Locale("", countryCode);
    }

    public Profesional(String nombre, String apellidos, String pais,
            Date nacimiento, String pathPerfil, String titulo, Date fechaGrad,
            String paisEstudio) {
        super(nombre, apellidos, pais, nacimiento, pathPerfil);
        this.setFechaDeGraduacion(fechaGrad);
        this.setPaisEstudio(paisEstudio);
        this.setTituloProfesional(titulo);
    }
}
