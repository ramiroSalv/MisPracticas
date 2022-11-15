package com.tarea;

public class Tienda {
    static double precio(){
        return 100.00;

    }
    static double precioIva(){
        return precio()*1.21;

    }

    public static void main(String[] args) {
        System.out.println("su compra es de: "+precio()+" U$D. Incluyendo el IVA le quedaría en: "+
        precioIva()+" U$D.");
    }
}
