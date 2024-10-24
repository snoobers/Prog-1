public class Dish {

    private String name;
    private double price;
    private String type;

    public Dish(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return name + " is a " + type + " and costs: " + price;
    }
    
}
