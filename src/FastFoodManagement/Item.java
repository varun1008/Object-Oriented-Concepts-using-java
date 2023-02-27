package FastFoodManagement;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return price;
    }

    public String printItem(){
        return name+" "+type + " ---- $" + price+"\n";
    }

}

class Burger extends Item{

    private List<Item> toppings = new ArrayList<>();

    public Burger(String name, String type, double price, String size) {
        super(name, type, price, size);
    }

    private Item topping(String t){
        return switch (t.toLowerCase()){
            case "cheese" -> new Item("Cheese slice","topping",1,"regular");
            case "chicken" -> new Item("Chicken patty","topping",2,"regular");
            case "onion" -> new Item("onion rings","topping",1,"regular");
            default -> new Item("unnamed","topping",1,"regular");
        };
    }

    public void addTopping(String topping){
        Item t = topping(topping);
        if (toppings.size() < 3){
            toppings.add(t);
        }else{
            System.out.println("Can only select three toppings");
        }
    }


    public double getAdjustedPrice(){
        double burgerPrice = 0;
        burgerPrice += getPrice();
        for (Item topping : toppings){
            burgerPrice += topping.getPrice();
        }
        return burgerPrice;
    }

    public String printItem(){
        String str = "";
        str += super.printItem();
        if (!toppings.isEmpty()){
            str += "Toppings : \n";
        }
        for (Item topping : toppings) str += ("\t" + topping.printItem());
        return str;
    }
}

class MealOrder{
    private Item side;
    private Item drink;
    private Burger burger;

    MealOrder(){
        Item side = new Item("fries","side",11,"regular");
        Item drink = new Item("coke","drink",7,"regular");
        Burger burger = new Burger("crispy chicken","burger",20,"regular");
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public void addToppings(String topping){
        burger.addTopping(topping);
    }

    public String printItems(){
        String str = "";
        str += burger.printItem();
        str += drink.printItem();
        str += side.printItem();
        return str;
    }

    public String printTotal(){
        double total = burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
        String str = "";
        str += ("------------------------ \n");
        str += ("Total ----- $" + total);
        return str;
    }
}
