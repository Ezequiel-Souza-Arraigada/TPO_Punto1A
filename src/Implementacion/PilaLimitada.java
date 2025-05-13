package Implementacion;

import Interfaz.InterfazPila;

public class PilaLimitada implements InterfazPila {

    private Nodo primero;
    private int capacidadMaxima;
    private int cantidadActual;

    public PilaLimitada(int capacidadMaxima) {
        this.primero = null;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    @Override
    public void add(int a) {
        if (cantidadActual >= capacidadMaxima) {
            System.out.println("Error: la pila alcanzó su capacidad máxima (" + capacidadMaxima + ")");
            return;
        }
        Nodo nuevo = new Nodo(a, primero);
        primero = nuevo;
        cantidadActual++;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            System.out.println("No se puede desapilar una pila vacía");
            return;
        }
        primero = primero.getNext();
        cantidadActual--;
    }

    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    @Override
    public int getTop() {
        if (isEmpty()) {
            System.out.println("No se puede obtener el tope de una pila vacía");
            return -1;
        }
        return primero.getValue();
    }

    public boolean isFull() {
        return cantidadActual == capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
