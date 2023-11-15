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
    // Constructor para inicializar el cliente con un nombre y la cantidad de verduras a consumir
    public Cliente(String nombre, int cantidadVerduras){
        this.nombre = nombre;
        this.cantidadVerduras = cantidadVerduras;
    }
    // Este es un metodo que simula el consumo de verduras por parte del cliente
    public void consumir() throws InterruptedException{
        for (int i = 0; i < cantidadVerduras; i++) {
            // Se genera un tiempo de consumo aleatorio entre 0 y 10000 milisegundos
            int tiempoConsumo = (int) (Math.random() * 10000);
            // El hilo se detiene durante el tiempo de consumo simulando la accion de consumir
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
