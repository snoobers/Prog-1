import java.util.List;
import java.util.ArrayList;

public class Menu {

    private List<Dish> menu;
    private String menuName;

    public Menu(String menuName){
        this.menu = new ArrayList<>();
        this.menuName = menuName;
    }

    public void addDish(Dish dish){
        menu.add(dish);
    }

    public boolean containsDish(String dishName){
        for (Dish dish : menu){
            if (dish.getName().toLowerCase().equals(dishName.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public void dishesOfType(String type){
        for (Dish dish : menu){
            if (dish.getType().toLowerCase().equals(type.toLowerCase())){
                System.out.println(dish.toString());
            }
        }
    }

    public String getMenuName(){
        return menuName;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Dish dish : menu){
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }
    
}
