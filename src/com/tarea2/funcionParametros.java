package com.tarea2;

public class funcionParametros {
    public static void main(String[] args) {

        double precio = 1020;
        double iva = 20;

        precioFinal(precio, iva);
    }

    private static void precioFinal(double precio, double iva) {
        double precioFinal = precio + iva*precio/100;
        System.out.println("El precio final es: " + precioFinal);
    }


}
