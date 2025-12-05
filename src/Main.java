import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Döner", 250));
        restaurant.addMenuItem(new MenuItem("Pilav", 150));
        restaurant.addMenuItem(new MenuItem("Ayran", 50));

    }
}
