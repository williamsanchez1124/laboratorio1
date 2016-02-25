/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author multi10
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        inventario gest= new inventario();
        int opcion=0; 
        double cantidades=0; 
        ArrayList<inventario> datos = new ArrayList<inventario>();
        boolean estado= false;
         String name;
        
        Scanner digite = new Scanner(System.in);
             
                    while(opcion!=7){
             System.out.println("seleccione la opcion deseada ");
             System.out.println("1.agregar producto");
             System.out.println("2.buscar producto");
             System.out.println("3.Eliminar eliminar");
             System.out.println("4.mostrar producto");
             System.out.println("5. realizar ventas");
             System.out.println("6.mostrar ganancias totales");
             System.out.println("7. salir");
             opcion=digite.nextInt();
             digite.nextLine();
                   
             switch (opcion){
                 case 1:
                    gest=new inventario ();
                    gest.ingresarproducto();
                    if(datos.size()==0)
                    {
                    datos.add(gest);
                    
                    }
                    else 
                    {
                    for (int i=0; i<datos.size(); i++)
                    {
                    if (gest.get_nombre().equals(datos.get(i).get_nombre()))
                    {
                        System.out.println("este producto ya existe");
                       estado=true;
                        break;
                    }
                    }
                    if(estado==false)
                    {
                        datos.add(gest);
                       
                    } 
                     break;
                    }
                    
                    break;
                    
                 case 2:
                     System.out.println("ingrese nombre de producto");
                     name=digite.nextLine();                     
                     for (int k=0; k<datos.size(); k++)
                     {
                    if (name.equals(datos.get(k).get_nombre()))
                    {
                       datos.get(k).mostrar();
                       estado=true;
                        break;  
                    }
                    }
                     if(estado==false)
                     {System.out.println("el producto no se encuentra por el momento");}
                     
                     break;
                 case 3:
                     System.out.println("ingrese nombre de producto");
                     name=digite.nextLine();                     
                     for (int k=0; k<datos.size(); k++){
                    if (name.equals(datos.get(k).get_nombre())){
                       datos.remove(k);
                       estado=true;
                        break;
                        
                    }
                    }
                     if(estado==false)
                     {
                     {System.out.println("el producto no se encuentra por el momento");}
                     }
                     break;
                     
                 case 4:
                     System.out.println("a continuacion este es el inventario que tenemos en pelichitos.com");
                      if(datos.size()==0){System.out.println("no hay productos");}
                      else
                      {
                     for (int k=0; k<datos.size(); k++)
                     {

                       datos.get(k).mostrar();
                         
                     } 
                     break;
                      }
                 
                 case 5:
                     System.out.println("ingrese nombre de producto que quiere comprar");
                      name=digite.nextLine();  
                       System.out.println("que cantidad desea comprar");
                       cantidades=digite.nextDouble();
                     for (int k=0; k<datos.size(); k++){
                    if (name.equals(datos.get(k).get_nombre())){
                        datos.get(k).comprar(cantidades);

                       estado=true;
                        break;
                        
                    }
                    }
                     if(estado==false)
                     {
                     {System.out.println("el producto no se encuentra por el momento");}
                     }
                     break; 
                      
                 case 6:
                     double b=0;
                      for (int k=0; k<datos.size(); k++){
                          b=datos.get(k).total_ventas()+b;
                      }
                      System.out.println("el valor de ventas totales es " +b);
                     break;
             }
                     
                    
    } 
             
        
    }
    
}
