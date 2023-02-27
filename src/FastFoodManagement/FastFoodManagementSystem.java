package FastFoodManagement;

public class FastFoodManagementSystem {
    public static void main(String[] args) {
        //OOP
        MealOrder meal = new MealOrder();
        meal.addToppings("chicken");
        meal.addToppings("cheese");
        meal.addToppings("onion");
        meal.addToppings("onion");
        System.out.println(meal.printItems());
        System.out.println(meal.printTotal());

    }
}
