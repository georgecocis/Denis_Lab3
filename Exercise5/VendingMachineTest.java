public class VendingMachineTest {

    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("Milk", 1L, 5, 2);
        Product product2 = new Product("Water", 2L, 10, 3);

        vendingMachine.createProduct(product1);
        vendingMachine.createProduct(product2);

        System.out.println("Display products:");
        vendingMachine.displayProducts();

        System.out.println("User menu:");
        vendingMachine.userMenu();

        System.out.println("Actual credit: " + vendingMachine.getCredit());

        int coinValue = 10;
        System.out.println("Inserting coin of value " + coinValue);
        vendingMachine.insertCoin(coinValue);

        System.out.println("New credit: " + vendingMachine.getCredit());

        vendingMachine.selectProduct(1L);
        System.out.println("Selected product: " + vendingMachine.getSelectedProduct());

        System.out.println("Buying selected product");
        vendingMachine.buyProduct();

        System.out.println("Credit after buying: " + vendingMachine.getCredit());

        System.out.println("Display products again: ");
        vendingMachine.displayProducts();


    }
}
