/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Scanner;

/**
 *
 * @author multi10
 */
public class inventario {
    private String nombre;
    private double cantidad;
    private double valor;
    private double numero_de_ventas=0;
    private double valor_venta;
    
    public void Ingresar (String nombre) {
       this.nombre = nombre;
    }

    public void setCantidad(double  documento) {
        this.cantidad = cantidad;
    }

    public void setValor(double rama) {
        this.valor = valor;
    }

    
    public void ingresarproducto(){
            
        Scanner digitar = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto: ");
        nombre = digitar.nextLine();
        System.out.println("ingrese la cantidad del producto: ");
        cantidad=digitar.nextDouble();
        System.out.println("ingrese el valor del producto (por unidad)");
        valor=digitar.nextDouble();

    }
    
        public void mostrar () {
    
               System.out.println("nombre: " +nombre);
               System.out.println("cantidad: " +cantidad);
               System.out.println("valor: " +valor);
               }
            public String  get_nombre ()
            {
    
            return nombre;
    
            }
         public void comprar (double compra)
                {

              cantidad= cantidad - compra;
              numero_de_ventas= compra;
              valor_venta= compra*valor;
              System.out.println("el numero de ventas es:  " + numero_de_ventas );
              System.out.println("el valor de su venta es:  " + valor_venta );
              
                } 
         
         public double total_ventas ()
                {
                       System.out.println("el producto " +nombre+ "se ha vendido " +numero_de_ventas+ "y su ganancia es " +valor_venta );
                    return numero_de_ventas;
                }
         
         
              
   
}
