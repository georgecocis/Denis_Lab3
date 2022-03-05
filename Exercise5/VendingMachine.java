import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<Long, Product> availableProducts;
    private double credit;
    private Long selectedProduct;

    public VendingMachine(){
        this.availableProducts = new HashMap<>();
        this.credit = 0;
        this.selectedProduct = -1L;
    }

    public void displayProducts(){
        for (Product product : availableProducts.values()){
            System.out.println("Id: " + product.getProductId() + ", name: " + product.getProductName() + ", price: " + product.getQuantity());
        }
    }

    public void insertCoin(int value){
        this.credit += value;
    }

    public void createProduct(Product product){
        if (availableProducts.containsKey(product.getProductId())){
            System.out.println("Product already exists");
        } else {
            availableProducts.put(product.getProductId(), product);
        }
    }

    public String selectProduct(Long id){
        if (availableProducts.containsKey(id)){
            this.selectedProduct = id;
            return availableProducts.get(id).getProductName();
        } else {
            return "Product does not exist";
        }
    }

    public void buyProduct(){
        Product product = availableProducts.get(selectedProduct);

        if (product == null){
            System.out.println("Error: no selected product");
            return;
        }

        if (product.isAvailable() && (this.credit >= product.getPrice())){
            product.sellProduct();
            System.out.println("Product price: " + product.getPrice());
            this.credit = this.credit - product.getPrice();
            System.out.println("Product bought");
        } else {
            System.out.println("Error: couldn't buy product");
        }
    }

    public void userMenu(){
        for (Product product : availableProducts.values()){
            System.out.println("Press " + product.getProductId() + " in order to buy " + product.getProductName());
        }
    }

    public double getCredit() {
        return credit;
    }

    public Long getSelectedProduct() {
        return selectedProduct;
    }
}
