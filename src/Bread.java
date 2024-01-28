public class Bread extends ProductForSale{
    private String breadShape;
    public Bread(String type, double price, String description, String breadShape) {
        super(type, price, description);
        this.breadShape=breadShape;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + ", bread shape: "+this.breadShape);
    }
}
