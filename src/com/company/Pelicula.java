package com.company;


import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String codigoImdb;
    private String titulo;
    private String anioDePublicación;
    private List<Ejemplar> listaDeEjemplares;
    private List<String> listaDeIdiomas;

    public Pelicula(String codigoImdb, String titulo, String anioDePublicación, List<Ejemplar> listaDeEjemplares, List<String> listaDeIdiomas) {
        this.codigoImdb = codigoImdb;
        this.titulo = titulo;
        this.anioDePublicación = anioDePublicación;
        this.listaDeEjemplares = listaDeEjemplares;
        this.listaDeIdiomas = listaDeIdiomas;
    }

//todo me falta hacer que las listas no esten vacias... mirar como se hacia para declarar

//todos los getters
    public String getCodigoImdb() {
        return codigoImdb;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnioDePublicación() {
        return anioDePublicación;
    }

    public List<Ejemplar> getListaDeEjemplares() {
        return listaDeEjemplares;
    }

    public List<String> getListaDeIdiomas() {
        return listaDeIdiomas;
    }

//todo acá creo que no necesito más nada.

}
