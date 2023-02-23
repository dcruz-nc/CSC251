package restaurantordersystem;

public class MenuMeal extends Meal {    
    private double priceOfSides;

    public MenuMeal(int mealNumber, String description, double price, double priceOfSides) {
        super(mealNumber, description, price);
        this.priceOfSides = priceOfSides;
    }
    
    public double getPriceOfSides() {
        return this.priceOfSides;
    }
    public void setPriceOfSides(double priceOfSides) {
        this.priceOfSides = priceOfSides;
    }
}
