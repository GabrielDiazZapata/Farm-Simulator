package net.salesiano.agricultura.granjeros;

public class Granjero extends Thread {
    // Atributos de la clase granjero:
    private String nombre;
    private int cantidadDeVerduras;
    private String[] verduras = { "lechuga", "repollo", "cebolla", "espinaca", "patata",
            "apio", "espárrago", "rábano", "brócoli", "alcachofa",
            "tomate", "pepino", "berenjena", "zanahoria", "judía verde" };

    public Granjero(String nombre, int cantidadDeVerduras) {
        this.nombre = nombre;
        this.cantidadDeVerduras = cantidadDeVerduras;
    }

    // Este metodo plantar crea un bucle en el que i = 0 y mientras
    // i sea menor que cantidadDeVerduras nunca va a terminar.
    public void plantar() throws InterruptedException {
        for (int i = 0; i < cantidadDeVerduras; i++) {
            // Se multiplican estos dos y dara como resultado un numero decimal
            // en el rango de la longitud del array: Si el array tiene como max 15
            // el resultado podria ser 7.345.
            // y el (int) lo que hace es convertir ese resultado 7.345 en 7 basicamente lo
            // trunca
            int verdurasAleatorias = (int) (Math.random() * verduras.length);
            String verdura = verduras[verdurasAleatorias];
            // Dormir el hilo un tiempo aleatorio: esto va simular el crecimiento de las plantas.
            // Guardar verdura en almacen
            System.out.println(nombre + " ha plantado una  " + verdura);
        }
    }

    @Override
    public void run() {
        try {
            plantar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
