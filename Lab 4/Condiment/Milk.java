package Condiment;

import Bevarage.IBevarage;
import Decorator.Decorator;

public class Milk extends Decorator {

    public Milk(IBevarage bevarage){
        super(bevarage);
    }

    @Override
    public String getName(){
        return super.getName() + ", Milk";
    }
    @Override
    public Double getPrice(){
        return super.getPrice() + 50;
    }
}

