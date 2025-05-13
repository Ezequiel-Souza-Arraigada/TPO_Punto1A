package Implementacion;

public class MainLimitado {
    public static void main(String[] args) {
        PilaLimitada pila = new PilaLimitada(3);

        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Apilo elementos
        pila.add(100);
        pila.add(200);
        pila.add(300);

        // Intento pasar el límite
        pila.add(400);  // No debería dejarme

        System.out.println("Elemento superior: " + pila.getTop());  // 300

        // Estado de la pila
        System.out.println("¿Está llena? " + pila.isFull());
        System.out.println("Cantidad actual: " + pila.getCantidadActual());

        // Desapilo
        pila.remove();
        System.out.println("Elemento superior después de desapilar: " + pila.getTop());  // 200
        System.out.println("Cantidad actual: " + pila.getCantidadActual());

        pila.remove(); // 100
        pila.remove(); // 0
        pila.remove(); // Desapilo pila vacía

        System.out.println("¿La pila está vacía después de desapilar todo? " + pila.isEmpty());
    }
}
