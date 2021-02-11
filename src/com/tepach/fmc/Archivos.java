/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.fmc;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony Tepach
 */
public class Archivos {
    String ruta="C:\\Users\\inspector\\Desktop\\LINUX\\8000 en ceros.txt";
    
    void ruta() throws IOException{
        File f=new File(ruta);
        System.out.println("Abosute file"+f.getAbsoluteFile());
        System.out.println("Abosute path"+f.getAbsolutePath());
        System.out.println("Canonnical file"+f.getCanonicalFile());
        System.out.println("Canonnical file"+f.getCanonicalPath());
        System.out.println("Parent "+f.getParent()+"\\");
        System.out.println(f.getName());
    }
    public static void main(String[] args) {
        try {
            new Archivos().ruta();
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
