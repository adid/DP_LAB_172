class SimpleProduct implements IProduct{
    private String name;
    private double price;
    private String description;

    public SimpleProduct(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: BDT " + price + ", Description: " + description);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}