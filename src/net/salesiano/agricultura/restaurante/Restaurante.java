package net.salesiano.agricultura.restaurante;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue; 
public class Restaurante {
    private BlockingQueue<String> almacen;
    private int tamañoAlmacen;


    public Restaurante(int tamañoAlmacen) {
        this.almacen = new LinkedBlockingQueue<>(tamañoAlmacen);
        this.tamañoAlmacen = tamañoAlmacen;
    }

    public void añadirVerduras(String verdura) throws InterruptedException {
        almacen.put(verdura);
        System.out.println("Se añadio una " + verdura + " en el almacén");
    }


    
}
