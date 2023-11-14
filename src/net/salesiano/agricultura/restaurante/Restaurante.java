package net.salesiano.agricultura.restaurante;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue; 
public class Restaurante {
    private BlockingQueue<String> almacen;
    private int tamañoAlmacen;

    // Este constructor inicializa el almacén con una capacidad especificada
    public Restaurante(int tamañoAlmacen) {
        this.almacen = new LinkedBlockingQueue<>(tamañoAlmacen);
        this.tamañoAlmacen = tamañoAlmacen;
    }

    /**
     * Este metodo permite a los granjeros agregar una verdura al almacén   
     * @param verdura La verdura que se va agregar al almacén
     * @throws InterruptedException Si hay interrupciones durante el proceso.
     */

    public void añadirVerduras(String verdura) throws InterruptedException {
        // Agrega la verdura al almacén
        almacen.put(verdura);
        System.out.println("Se añadio una " + verdura + " en el almacén");
    }


    /**
     * Este metodo permite a los clientes consumir una verdura del almacén
     * @return La verdura consumida
     * @throws InterruptedException Si hay interrupciones durante el proceso.
     */

    public String consumirVerdura() throws InterruptedException {
        // Esto lo que hace es tomar la verdura del almacén
        String verdura = almacen.take();
        System.out.println("Se ha consumido una " + verdura);
        // Devuelve la verdura ya consumida
        return verdura;
    }

    
}
