package Bevarage;

public class Latte implements IBevarage{

    String name;
    Double amount;

    public Latte(String name, Double amount){
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
