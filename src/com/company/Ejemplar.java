package com.company;

public abstract class Ejemplar{
    private Integer codigoDeEjemplar;
    private Pelicula pelicula;
    private Boolean alquilado;

    public Ejemplar(Integer codigoDeEjemplar, Pelicula pelicula, Boolean alquilado) {
        this.codigoDeEjemplar = codigoDeEjemplar;
        this.pelicula = pelicula;
        this.alquilado = alquilado;
    }

    public Integer getCodigoDeEjemplar() {
        return codigoDeEjemplar;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Boolean getAlquilado() {
        return alquilado;
    }


    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }
}
