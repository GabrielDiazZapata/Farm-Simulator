import net.salesiano.agricultura.clientes.Cliente;
import net.salesiano.agricultura.granjeros.Granjero;

public class App {
    public static void main(String[] args) throws Exception {
        // Granjero paco = new Granjero("Paco", 10);
        // paco.start();
        Cliente manolo = new Cliente("Manolo", 5);
        manolo.start();
    }
}
