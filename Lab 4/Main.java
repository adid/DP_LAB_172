import Bevarage.Cappuccino;
import Bevarage.Espresso;
import Bevarage.IBevarage;
import Bevarage.Latte;
import Condiment.Milk;
import Condiment.WhippedCream;
import Condiment.WhiteSugar;

public class Main {

    public static void main(String[] args){
        IBevarage espresso = new Espresso("Espresso" , 200.0);
        espresso = new WhiteSugar(espresso);

        System.out.println(espresso.getName());
        System.out.println(espresso.getPrice());

        IBevarage cappuccino = new Cappuccino("Cappuccino" , 300.0);
        cappuccino = new Milk(cappuccino);
        cappuccino = new WhippedCream(cappuccino);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());

        IBevarage latte = new Latte("Latte", 350.0);

        System.out.println(latte.getName());
        System.out.println(latte.getPrice());
    }
}
