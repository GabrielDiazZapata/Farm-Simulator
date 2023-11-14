import net.salesiano.agricultura.clientes.Cliente;
import net.salesiano.agricultura.granjeros.Granjero;
import net.salesiano.agricultura.restaurante.Restaurante;

public class App {
    public static void main(String[] args)  {
       Granjero gonzalo = new Granjero("Gonzalo", 10);
       Granjero pepe = new Granjero("Pepe", 10);

       Cliente laPinta = new Cliente("La Pinta", 5);
       Cliente laNiña = new Cliente("La Niña", 10);
       Cliente laSantaMaria = new Cliente("Y la Santa Maria", 5);

       Restaurante restaurante = new Restaurante(15);

       gonzalo.setRestaurante(restaurante);
       pepe.setRestaurante(restaurante);



       laPinta.setRestaurante(restaurante);
       laNiña.setRestaurante(restaurante);
       laSantaMaria.setRestaurante(restaurante);


       gonzalo.start();
       pepe.start();
       laPinta.start();
       laNiña.start();
       laSantaMaria.start();



       try {
         // Lo que va hacer es esperar a que todos los hilos terminen
         gonzalo.join();
         pepe.join();
         laPinta.join();
         laNiña.join();
         laSantaMaria.join();
       } catch (InterruptedException e) {
        e.printStackTrace();
        }
        System.out.println("Simulación completada...");
    }
}
