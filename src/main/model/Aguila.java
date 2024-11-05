package main.model;

import main.model.interfaces.VolarAble;
import main.model.interfaces.RespirarAble;
import main.model.interfaces.TerrestreAble;
import main.model.interfaces.NadarAble;


public class Aguila implements VolarAble, RespirarAble, NadarAble, TerrestreAble {
    
    @Override
    public void volar() {
        System.out.println("El Aguila vuela");
    }
   
    @Override
    public void respirar() {
        System.out.println("El Aguila respira");
    }

    @Override
    public void terrestre() {
        System.out.println("El Aguila camina");
    }

    @Override
    public void nadar() {
        System.out.println("El Aguila puede nadar");
    }
}
