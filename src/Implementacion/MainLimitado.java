package Implementacion;

public class MainLimitado {
    public static void main(String[] args) {
        PilaLimitada pila = new PilaLimitada(3);  // Capacidad máxima: 3 elementos

        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Apilar elementos
        pila.add(100);
        pila.add(200);
        pila.add(300);

        // Intentar pasar el límite
        pila.add(400);  // No debería permitirlo

        System.out.println("Elemento superior: " + pila.getTop());  // 300

        // Estado de la pila
        System.out.println("¿Está llena? " + pila.isFull());
        System.out.println("Cantidad actual: " + pila.getCantidadActual());

        // Desapilar
        pila.remove();
        System.out.println("Elemento superior después de desapilar: " + pila.getTop());  // 200
        System.out.println("Cantidad actual: " + pila.getCantidadActual());

        pila.remove(); // 100
        pila.remove(); // 0
        pila.remove(); // Desapilar vacía

        System.out.println("¿La pila está vacía después de desapilar todo? " + pila.isEmpty());
    }
}
