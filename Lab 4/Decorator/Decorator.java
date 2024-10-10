package Decorator;

import Bevarage.IBevarage;

public abstract class Decorator implements IBevarage{
    private IBevarage bevarage;

    public Decorator(IBevarage bevarage){
        this.bevarage = bevarage;
    }

    public Double getPrice(){
        return bevarage.getPrice();
    }

    public String getName(){
        return bevarage.getName();
    }

}
