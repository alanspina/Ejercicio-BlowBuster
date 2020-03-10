package com.company;

public class EjemplarVhs extends Ejemplar implements Alquilable {


    private String fechaDeFabricacion;

    public EjemplarVhs(Integer codigoDeEjemplar, Pelicula pelicula, Boolean alquilado, String fechaDeFabricacion) {
        super(codigoDeEjemplar, pelicula, alquilado);
        this.fechaDeFabricacion = fechaDeFabricacion;
    }


    @Override
    public void serAlquilado() {
        if (this.getAlquilado() == false) {
            this.setAlquilado(true);
            System.out.println("Usted ha alquilado la pelicula: " + this.getPelicula());
        } else {
            System.out.println("La pelicula ya se encuentra alquilada");
        }
    }
}
