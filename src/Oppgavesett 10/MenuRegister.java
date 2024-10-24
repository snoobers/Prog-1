import java.util.List;
import java.util.ArrayList;

public class MenuRegister {
    
    private List<Menu> menuRegister;

    public MenuRegister(){
        menuRegister = new ArrayList<>();
    }

    public void addDishToMenu(String Menu, Dish dish){
        for (Menu menu : menuRegister){
            if (menu.getMenuName().toLowerCase().equals(Menu.toLowerCase())){
                menu.addDish(dish);
                System.out.println(dish.getName() + " was added to the menu: " + menu.getMenuName());
            } 
        }
    }

    public void findDish(String dishName){
        for (Menu menu : menuRegister){
            if (menu.containsDish(dishName)){
                System.out.println(menu.getMenuName() + " contains " + dishName);
            }
        }
    }

    public void findDishesOfType(String type){
        for (Menu menu : menuRegister){
            menu.dishesOfType(type);
        }
    }

    public void registerNewMenu(String menuName){
        Menu newMenu = new Menu(menuName);
        menuRegister.add(newMenu);
        System.out.println("A new menu was added to the menu register.");
    }

    public void findMenusWithinInterval(double intervalStart, double intervalEnd){
        for (Menu menu : menuRegister){
            if (menu.getTotalPrice() > intervalStart && menu.getTotalPrice() < intervalEnd){
                System.out.println(menu.getMenuName() + " is within this interval.");
            }
        }
    }
}
