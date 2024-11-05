package main.model;

import main.model.interfaces.RespirarAble;
import main.model.interfaces.TerrestreAble;
import main.model.interfaces.NadarAble;



public class Oso implements RespirarAble, TerrestreAble, NadarAble {
   
    @Override
    public void respirar() {

        System.out.println("El Oso respira");
    }

    @Override
    public void terrestre() {

        System.out.println("El Oso camina");
    }

    @Override
    public void nadar() {

        System.out.println("El Oso nada");
    }
    
  
}
