/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto5;

/**
 *
 * @author GranSayaiman
 */
public class Biblioteca {
    private String nombreArchivo;
    private String editorial;

    public Biblioteca(String nombreArchivo, String editorial) {
        this.nombreArchivo = nombreArchivo;
        this.editorial = editorial;
    }

    public Biblioteca() {
    }
    

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
    
    
}
