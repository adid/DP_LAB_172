package Bevarage;

public class Espresso implements IBevarage{

    String name;
    Double amount;
    public Espresso(String name, Double amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }
    public Double getPrice(){
        return amount;
    }
}
