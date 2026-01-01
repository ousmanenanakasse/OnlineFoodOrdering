import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Döner", 250));
        restaurant.addMenuItem(new MenuItem("Tavuk", 250));
        restaurant.addMenuItem(new MenuItem("Pasta", 200));

        Customer customer = new Customer("Salim Watt", "Zafer Mah. 34523", "9476-8161");
        System.out.println("WELCOME " + customer.getName());

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running){
            restaurant.displayMenu();
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.println("Select an option: ");

            int choice = scanner.nextInt();
            if (choice>=1 && choice<=3){
                MenuItem item = restaurant.getItem(choice-1);
                customer.addToCart(item);

            }else if (choice==4){
                customer.checkout();

                System.out.println("Choose payment: 1. Credit Card  2. Cash");
                int payChoice = scanner.nextInt();
                PaymentMethod payment;

                if (payChoice == 1) payment = new CreditCardPayment();
                else payment = new CashPayment();

                payment.pay(250);

            } else {
                running = false;
            }

        }
    }
}
