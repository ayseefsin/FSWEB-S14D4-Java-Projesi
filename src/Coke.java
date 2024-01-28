public class Coke extends ProductForSale{
    private double size;
    public Coke(String type, double price, String description,double size) {
        super(type, price, description);
        this.size= size;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + ", size: " + this.size);
    }
}
