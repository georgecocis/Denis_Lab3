public class Product {
    private String productName;
    private Long productId;
    private int quantity;
    private double price;

    public Product(String productName, Long productId, int quantity, double price){
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sellProduct(){
        this.quantity--;
    }

    public boolean isAvailable(){
        return quantity > 0;
    }
}
