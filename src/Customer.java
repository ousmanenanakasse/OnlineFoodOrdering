import java.util.ArrayList;
import java.util.List;

public class Customer extends User implements Orderable{
    private List<MenuItem> cart;

    public Customer(String name, String address, String PhoneNumber){
        super(name, address, PhoneNumber);
        this.cart = new ArrayList<>();
    }

    @Override
    public void addToCart(MenuItem item){
        cart.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    @Override
    public void checkout(){
        if(cart.isEmpty()){
            System.out.println(" Cart is empty. ");
            return;
        }
        double total = 0;
        System.out.println("\n--- Order summary for " + getName() + " ---");
        System.out.println("Address: " + getAddress());
        for (MenuItem item : cart){
            System.out.println(item);
            total+= item.getPrice();
        }
        System.out.println("Total Amount: $" + total);
        cart.clear();
    }
}
