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
        // Esto va bloquear el acceso al almacén hata que haya espacio disponible en el.
        synchronized (almacen) {
            while (almacen.size() >= tamañoAlmacen) {
                // Imprime un mensaje indicando que el almacén está lleno y el hilo actual está en espera.
                System.out.println("El almacén esta lleno. " + Thread.currentThread().getName() + " espera.");
                almacen.wait();
                
            }
        }
        // Agrega la verdura al almacén
        almacen.put(verdura);
        // Imprime un mensaje indicando que el hilo actual ha plantado una verdura específica en el almacén.
        System.out.println(Thread.currentThread().getName() + "Se añadio una " + verdura + " en el almacén");
        // Aqui vamos a notificar a los consumidores que hay verduras disponibles en el almacén
        almacen.notifyAll();
    }


    /**
     * Este metodo permite a los clientes consumir una verdura del almacén
     * @return La verdura consumida
     * @throws InterruptedException Si hay interrupciones durante el proceso.
     */

    public String consumirVerdura() throws InterruptedException {
        // Aquí se hace lo mismo bloqueamos el acceso al almacén hasta que haya verduras disponibles
        synchronized(almacen){
            while (almacen.isEmpty()) {
                // Imprime un mensaje indicando que el almacén está vacío y el hilo actual está en espera.
                System.out.println("El almacén esta vacío. " + Thread.currentThread().getName() + " espera.");
                almacen.wait();
                
            }
        }
        // Esto lo que hace es tomar la verdura del almacén
        String verdura = almacen.take();
        // Imprime un mensaje indicando que el hilo actual (ya sea un cliente) ha consumido una verdura específica.
        System.out.println(Thread.currentThread().getName() + " Se ha consumido una " + verdura);

        // Le notificamos al Granjero que hay espacio disponible en el almacén
        almacen.notifyAll();
        // Devuelve la verdura ya consumida
        return verdura;
    }

    
}
