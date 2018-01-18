
package com.qualitas.service;

import com.google.gson.Gson;
import com.qualitas.modelo.entities.Computadora;


public class Lanzador {
    public static void main(String[] args){
        
        //Computadora instancia = new Computadora("LENOVO", 4, 600);
        //System.out.println(instancia);
        
        Gson gson = new Gson();
        String json = gson.toJson(new Computadora("Lenovo", 10, 600));
        System.out.println(json);

    
    }
}
