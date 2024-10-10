package Condiment;

import Bevarage.IBevarage;
import Decorator.Decorator;

public class WhippedCream extends Decorator {

    public WhippedCream(IBevarage bevarage){
        super(bevarage);
    }

    @Override
    public String getName(){
        return super.getName() + ", WhippedCream";
    }
    @Override
    public Double getPrice(){
        return super.getPrice() + 70;
    }
}

