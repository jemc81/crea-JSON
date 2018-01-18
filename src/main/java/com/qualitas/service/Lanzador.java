package com.qualitas.service;

import com.google.gson.JsonObject;
import com.qualitas.modelo.entities.Computadora;

public class Lanzador {
    public static void main (String[]args){
//        Computadora instancia = new Computadora("COMPAQ",4,500);
       JsonObject compu = new JsonObject();
       compu.addProperty("marca","Compaq");
       compu.addProperty("disco","500");
       compu.addProperty("ram","6");
       
       String json = compu.toString();
       
       System.out.println(json);
    }
}
