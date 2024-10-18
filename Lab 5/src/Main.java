//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProduct shampoo = new SimpleProduct("Shampoo", 500, "Clear Men Anti-dandruff Shampoo");
        IProduct soap = new SimpleProduct("Soap", 100, "Lux Soap");
        IProduct conditioner = new SimpleProduct("Conditioner", 300, "Dove Conditioner");

        Bundle cosmetics = new Bundle("Cosmetics", 10);
        cosmetics.addProduct(shampoo);
        cosmetics.addProduct(soap);
        cosmetics.addProduct(conditioner);

        IProduct eyeliner = new SimpleProduct("Eyeliner", 2000, "Lloreal Eyeliner");
        IProduct lipstick = new SimpleProduct("lipstick", 1000, "Lakme Lipstick");
        Bundle makeUpBundle = new Bundle("Make-Up Bundle", 5);
        makeUpBundle.addProduct(eyeliner);
        makeUpBundle.addProduct(lipstick);
        cosmetics.addProduct(makeUpBundle);

        cosmetics.displayProduct();
    }
}