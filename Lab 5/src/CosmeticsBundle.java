public class CosmeticsBundle extends  Bundle{
    IProduct product;
    CosmeticsBundle(){
        super("Cosmetics", 10);
    }

    @Override
    public void build() {
        products.add(new SimpleProduct("Shampoo", 500, "Clear Men Anti-dandruff Shampoo"));
        products.add(new SimpleProduct("Soap", 100, "Lux Soap"));
        products.add(new SimpleProduct("Conditioner", 300, "Dove Conditioner"));
    }
}
