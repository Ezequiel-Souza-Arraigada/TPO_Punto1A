package Implementacion;

public class Main {
    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();

        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Apilar elementos
        pila.add(10);
        pila.add(20);
        pila.add(30);

        System.out.println("Elemento superior: " + pila.getTop());  // 30

        // Desapilar un elemento
        pila.remove();
        System.out.println("Elemento superior después de desapilar: " + pila.getTop());  // 20

        // Desapilar todos los elementos
        pila.remove();
        pila.remove();
        pila.remove();  // Intento desapilar en pila vacía

        System.out.println("¿La pila está vacía después de desapilar todo? " + pila.isEmpty());
    }
}
