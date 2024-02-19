/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto5;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GranSayaiman
 */
public class Proyecto5 {

    public static void main(String[] args) {
        
        Proyecto5 p =new Proyecto5();
         
         Scanner entrada = new Scanner(System.in);
         
                
        
        List<Libro> librolist = new LinkedList<>();
        List<Revista> revistalist = new LinkedList<>();
        
        
        
        for (int i = 0; i < 5; i++) {
            int opcion=p.inicio();
            Libro libroobj = new Libro();
        Revista revistaobj = new Revista();
        
        if(opcion==1){
        
            
        System.out.println("Libro" );
        String libro =entrada.next();
        libroobj.setNombreArchivo(libro);
        
        
        
        
         
         int valor=libroobj.prestar(librolist, libro);
        
         if(valor==0){
             
             librolist.add(libroobj);
             
             
             
         }
         
        
            
        }else if(opcion==2){
            System.out.println("Revista" );
        String revista =entrada.next();
        revistaobj.setNombreArchivo(revista);
        int valor2 =revistaobj.prestar(revistalist,revista);
        
        if(valor2==0){
            revistalist.add(revistaobj);
            
            
        }
        
        
        
        }else{
            System.out.println("Opcion no valida");
        }
            
        }
        
        
        
        
    }
    
    public int  inicio(){
        System.out.println("Bienvedo");
        Scanner entrada = new Scanner(System.in);
        System.out.println("1.Libro 2.Revista" );
        int opcion=entrada.nextInt();
        return opcion;
        
    }
}
