package Implementacion;

public class MainConjuntoRepetidos {
    public static void main(String[] args) {
        ConjuntoConRepetidos conjunto = new ConjuntoConRepetidos();

        conjunto.agregar(10);
        conjunto.agregar(10);
        conjunto.agregar(20);
        conjunto.agregar(10);
        conjunto.agregar(20);

        conjunto.mostrar();  // 10 x3, 20 x2

        conjunto.quitar(10);
        conjunto.quitar(20);

        conjunto.mostrar();  // 10 x2, 20 x1

        conjunto.quitar(20);
        conjunto.quitar(30);  // no está

        conjunto.mostrar();  // 10 x2
    }
}
