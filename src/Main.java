import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Burger", 8.99));
        restaurant.addMenuItem(new MenuItem("Pizza", 12.50));
        restaurant.addMenuItem(new MenuItem("Soda", 2.00));


        Customer customer = new Customer("John Doe", "123 Main St", "555-0199");
        System.out.println("Welcome, " + customer.getName());

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            restaurant.displayMenu();
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                // Add to cart
                MenuItem item = restaurant.getItem(choice - 1);
                customer.addToCart(item);
            } else if (choice == 4) {

                customer.checkout();


                System.out.println("Choose payment: 1. Credit Card  2. Cash");
                int payChoice = scanner.nextInt();
                PaymentMethod payment;

                if (payChoice == 1) payment = new CreditCardPayment();
                else payment = new CashPayment();


                payment.pay(25.00);

            } else {
                running = false;
            }
        }
    }
}