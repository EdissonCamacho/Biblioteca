/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto5;

import java.util.List;

/**
 *
 * @author GranSayaiman
 */
public class Libro extends Biblioteca {
    
    private String autor;

    public Libro() {
    }

    
    public Libro(String autor, String nombreArchivo, String editorial) {
        super(nombreArchivo, editorial);
        this.autor = autor;
    }

    public Libro(String autor) {
        this.autor = autor;
    }
    
    public int prestar(List<Libro> dato, String dato2){
        
       
        for(Libro l : dato){
            
            if(l.getNombreArchivo().equals(dato2)){
                System.out.println("Ya se presto este Libro"+" "+dato2);
                return 1;
            }
        }
        return 0;
        
    }   
    
     
        
        
        
        
    

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor+" "+getNombreArchivo() + '}';
    }
    
}
    
    

    

   
    

   
    
    
    

