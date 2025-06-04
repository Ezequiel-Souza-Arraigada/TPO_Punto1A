package Implementacion;

import java.util.ArrayList;

public class ConjuntoConRepetidos {

    private static class Entrada {
        int valor;
        int cantidad;

        Entrada(int valor) {
            this.valor = valor;
            this.cantidad = 1;
        }
    }

    private ArrayList<Entrada> elementos;

    public ConjuntoConRepetidos() {
        elementos = new ArrayList<>();
    }

    public void agregar(int valor) {
        for (Entrada e : elementos) {
            if (e.valor == valor) {
                e.cantidad++;
                return;
            }
        }
        elementos.add(new Entrada(valor));
    }

    public void quitar(int valor) {
        for (int i = 0; i < elementos.size(); i++) {
            Entrada e = elementos.get(i);
            if (e.valor == valor) {
                if (e.cantidad > 1) {
                    e.cantidad--;
                } else {
                    elementos.remove(i);
                }
                return;
            }
        }
        System.out.println("El valor " + valor + " no está en el conjunto.");
    }

    public boolean contiene(int valor) {
        for (Entrada e : elementos) {
            if (e.valor == valor) {
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("Conjunto vacío.");
            return;
        }
        System.out.println("Contenido del conjunto con repetidos:");
        for (Entrada e : elementos) {
            System.out.println(e.valor + " x" + e.cantidad);
        }
    }
}
