package net.salesiano.agricultura.clientes;

import net.salesiano.agricultura.restaurante.Restaurante;

public class Cliente extends Thread {
    private String nombre;
    private int cantidadVerduras;

    private Restaurante restaurante;
    // Este metodo lo que hace es  asignar un restaurante al cliente para poder utilizarlo en el App.java
    public void setRestaurante(Restaurante restaurante){
        this.restaurante = restaurante;
    } 

    public Cliente(String nombre, int cantidadVerduras){
        this.nombre = nombre;
        this.cantidadVerduras = cantidadVerduras;
    }

    public void consumir() throws InterruptedException{
        for (int i = 0; i < cantidadVerduras; i++) {
            int tiempoConsumo = (int) (Math.random() * 5000);
            Thread.sleep(tiempoConsumo);

            System.out.println(nombre + " ha consumido una verdura");
        }

    }



    @Override 
    public void run() {
        try {
            consumir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
