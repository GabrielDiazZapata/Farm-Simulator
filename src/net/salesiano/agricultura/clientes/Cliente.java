package net.salesiano.agricultura.clientes;

public class Cliente extends Thread {
    private String nombre;
    private int cantidadVerduras;

    public Cliente(String nombre, int cantidadVerduras){
        this.nombre = nombre;
        this.cantidadVerduras = cantidadVerduras;
    }

    public void consumir() throws InterruptedException{
        for (int i = 0; i < cantidadVerduras; i++) {
            
        }

    }
}
