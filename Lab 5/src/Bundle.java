import java.util.ArrayList;
import java.util.List;

abstract class Bundle implements IProduct {
    protected String bundleName;
    protected List<IProduct> products = new ArrayList<>();
    protected int discount;
    protected double totalPrice= 0;

    public Bundle(String bundleName, int discount) {
        this.bundleName = bundleName;
        this.discount = discount;
    }

    public abstract void build();

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public void removeProduct(IProduct product) {
        products.remove(product);
    }

    @Override
    public void displayProduct() {
        System.out.println("================================================*****================================================");
        System.out.println("Bundle: " + bundleName);
        for (IProduct product : products) {
            product.displayProduct();
        }
        System.out.println(bundleName +" Total Price: BDT " + calculatePrice());
        System.out.println("================================================*****================================================");
    }

    @Override
    public double calculatePrice() {
        for (IProduct product : products) {
            totalPrice += product.calculatePrice();
        }
        totalPrice *= ((double) (100 - discount) / 100);
        return Math.round(totalPrice / 5) * 5;
    }
}