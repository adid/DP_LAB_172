package Condiment;

import Bevarage.IBevarage;
import Decorator.Decorator;

public class WhiteSugar extends Decorator {

    public WhiteSugar(IBevarage bevarage){
        super(bevarage);
    }

    @Override
    public String getName(){
        return super.getName() + ", WhiteSugar";
    }
    @Override
    public Double getPrice(){
        return super.getPrice() + 20;
    }
}

