package dominio;

import dominio.utils.Tipos.*;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;
    private ArrayList<Alimento> listaAlimentos;
    private ArrayList<Consulta> listaConsultasDirectasPendientes;
    private ArrayList<Consulta> listaPlanAlimenticioPendientes;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public ArrayList<Consulta> getListaConsultasDirectasPendientes() {
        return listaConsultasDirectasPendientes;
    }

    public ArrayList<Consulta> getListaPlanAlimenticioPendientes() {
        return listaPlanAlimenticioPendientes;
    }

    public Sistema() {
        listaUsuarios = new ArrayList<Usuario>();
        listaProfesionales = new ArrayList<Profesional>();
        listaAlimentos = new ArrayList<Alimento>();
        listaConsultasDirectasPendientes = new ArrayList<Consulta>();
        listaPlanAlimenticioPendientes = new ArrayList<Consulta>();
    }

    public void agregarUsuario(String nombre, String apellidos, String nacionalidad, Date nacimiento, String pathPerfil) {
        Usuario nuevoUsuario = new Usuario(nombre, apellidos, nacionalidad, nacimiento, pathPerfil);
        this.getListaUsuarios().add(nuevoUsuario);
    }

    public void agregarProfesional(String nombre, String apellidos, String nacionalidad, Date nacimiento, String pathPerfil, String titulo, String paisTitulo, Date fechaGrad) {
        Profesional nuevoProfesional = new Profesional(nombre, apellidos, nacionalidad, nacimiento, pathPerfil, titulo, fechaGrad, paisTitulo);
        this.getListaProfesionales().add(nuevoProfesional);
    }

    public void agregarAlimento(String nombre, String familia, ArrayList<String> nutrientes) {
        Alimento nuevoAlimento = new Alimento(nombre, familia);
        this.getListaAlimentos().add(nuevoAlimento);

    }

    public void cargarConsultasPendientes() {
        for (int i = 0; i < this.getListaUsuarios().size(); i++) {
            Usuario usuario = this.getListaUsuarios().get(i);
            ArrayList<Consulta> consultasDeUsuario = usuario.getConsultas();
            for (int j = 0; j < consultasDeUsuario.size(); j++) {
                Consulta consulta = consultasDeUsuario.get(i);
                if (consulta.getEstado() == Estado.PENDIENTE) {
                    if (consulta.getCategoria() == Categoria.DIRECTA) {
                        this.getListaConsultasDirectasPendientes().add(consulta);
                    } else {
                        this.getListaPlanAlimenticioPendientes().add(consulta);
                    }
                }
            }
        }
    }
}
