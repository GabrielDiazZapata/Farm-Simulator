import net.salesiano.agricultura.clientes.Cliente;
import net.salesiano.agricultura.granjeros.Granjero;
import net.salesiano.agricultura.restaurante.Restaurante;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurante restaurante = new Restaurante(10);

        try {
            restaurante.añadirVerduras("lechuga");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            String verduraConsumida = restaurante.consumirVerdura();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
