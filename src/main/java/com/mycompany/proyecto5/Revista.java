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
public class Revista extends Biblioteca {
    
    private String tema;

    public Revista() {
    }

    public Revista(String tema, String nombreArchivo, String editorial) {
        super(nombreArchivo, editorial);
        this.tema = tema;
    }

    public Revista(String tema) {
        this.tema = tema;
    }
    
     public int prestar(List<Revista> dato, String dato2){
        
       
        for(Revista l : dato){
            
            if(l.getNombreArchivo().equals(dato2)){
                System.out.println("Ya se presto esta Revista" +" "+ dato2);
                return 1;
            }
        }
        return 0;
        
    } 
    
    
    
    
    
}
