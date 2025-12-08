import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Döner", 250));
        restaurant.addMenuItem(new MenuItem("Pilav", 150));
        restaurant.addMenuItem(new MenuItem("Ayran", 50));

        Customer customer = new Customer("Salim Watt", "Zafer Mah. 34523", "9476-8161");
        System.out.println("WELCOME " + customer.getName());

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running){

        }

    }

}
