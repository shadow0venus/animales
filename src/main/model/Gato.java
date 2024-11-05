package main.model;

import main.model.interfaces.RespirarAble;
import main.model.interfaces.TerrestreAble;
import main.model.interfaces.NadarAble;



public class Gato implements RespirarAble, TerrestreAble, NadarAble {
   
    @Override
    public void respirar() {

        System.out.println("El gato respira");
    }

    @Override
    public void terrestre() {

        System.out.println("El gato camina");
    }

    @Override
    public void nadar() {

        System.out.println("El gato nada");
    }
    
  
}