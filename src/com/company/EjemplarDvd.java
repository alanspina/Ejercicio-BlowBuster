package com.company;

public class EjemplarDvd extends Ejemplar implements Alquilable {
    private String numeroDeZona;

    public EjemplarDvd(Integer codigoDeEjemplar, Pelicula pelicula, Boolean alquilado, String numeroDeZona) {
        super(codigoDeEjemplar, pelicula, alquilado);
        this.numeroDeZona = numeroDeZona;
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
