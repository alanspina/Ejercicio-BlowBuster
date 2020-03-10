package com.company;

public class EjemplarBluRay extends Ejemplar implements Alquilable {

    public EjemplarBluRay(Integer codigoDeEjemplar, Pelicula pelicula, Boolean alquilado) {
        super(codigoDeEjemplar, pelicula, alquilado);
    }

    @Override
    public void serAlquilado() {
        if (this.getAlquilado() == false){
            this.setAlquilado(true);
            System.out.println("Usted ha alquilado la pelicula: "+ this.getPelicula());
        } else{
            System.out.println("La pelicula ya se encuentra alquilada");
        }
    }
}
