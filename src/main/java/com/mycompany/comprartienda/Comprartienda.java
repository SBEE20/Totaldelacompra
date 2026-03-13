/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comprartienda;

public class Comprartienda {
    public static double compratotal(double precio, int cantidad){
    
    double subtotal= precio * cantidad;
    double iva = subtotal * 0.15;
    double total = subtotal+ iva;
    return total;
    }

    public static void main(String[] args) {
        
        int cantidad = 15;
        double precio = 0.75;
        double resultado = compratotal(precio, cantidad);
        
        System.out.println("El total de su compra es: "+ resultado);
    }
}
