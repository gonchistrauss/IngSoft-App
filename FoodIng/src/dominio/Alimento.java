/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author gonzalostrauss
 */
public class Alimento {

    private String nombre;
    private String familia;
    int cantidades;
    //private Familia familia;
    //private Diccionario<String,String> nutrientes;
    private ArrayList<String> nutrientes;

    public String getNombre() {
        return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public ArrayList<String> getNutrientes() {
        return nutrientes;
    }

    public void agregarNutriente(String nutriente) {
        nutrientes.add(nutriente);
    }

    public Alimento(String nombre, String familia) {
        this.setNombre(nombre);
        this.setFamilia(familia);
        this.nutrientes = new ArrayList<String>();
    }
}
