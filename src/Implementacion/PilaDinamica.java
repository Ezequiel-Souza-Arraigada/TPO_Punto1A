package Implementacion;

import Interfaz.InterfazPila;

public class PilaDinamica implements InterfazPila {

    private Nodo primero;

    public PilaDinamica() {
        this.primero = null;
    }

    @Override
    public void add(int a) {
        // Inserta un nuevo nodo en el primer elemento  de la pila
        this.primero = new Nodo(a, this.primero);
    }

    @Override
    public void remove() {
        if(this.primero == null) {
            System.out.println("No se puede desapilar una pila vacía");
            return;
        }
        // Quita el nodo superior
        this.primero = this.primero.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.primero == null;
    }

    @Override
    public int getTop() {
        if(this.primero == null) {
            System.out.println("No se puede obtener el tope de una pila vacía");
            return -1;
        }
        return this.primero.getValue();
    }
}
