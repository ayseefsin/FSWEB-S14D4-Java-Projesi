import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate1 = new Chocolate("desert",49.99,"çok lezzetli","brown");
        ProductForSale coke1 = new Coke("zero sugar",39.99,"serinletici", 1.50);
        ProductForSale bread1 = new Bread("cereal",29.99,"tortilla","circle");
        ProductForSale[] products = new ProductForSale[3];
        products[0]=chocolate1;
        products[1]= coke1;
        products[2]=bread1;
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products ){
            product.showDetails();
        }
    }
}