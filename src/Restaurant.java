import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private List<MenuItem> menu;

    public Restaurant(){
        this.menu = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item){
        menu.add(item);
    }
    public void displayMenu(){
        System.out.println("\n---MENU---");
        for (int i = 0; i < menu.size(); i++ ){
            System.out.println((i + 1) + " ."+ menu.get(i));
        }
    }
    public MenuItem getItem(int index){
        if (index >= 0 && index < menu.size()){
            return menu.get(index);
        }
        return null;
    }
}
