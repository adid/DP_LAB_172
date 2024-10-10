package Bevarage;

public class Cappuccino implements IBevarage{

    String name;
    Double amount;

    public Cappuccino(String name, Double amount){
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
