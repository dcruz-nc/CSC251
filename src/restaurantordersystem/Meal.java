package restaurantordersystem;

public class Meal {
    //SUPERCLASS
    private int mealNumber;
    private String description;
    private double price;
    
    public Meal(int mealNumber, String description, double price) {
        this.mealNumber = mealNumber;
        this.description = description;
        this.price = price;
    }
    
    public int getMealNumber() {
        return this.mealNumber;
    }
    public void setMealNumber(int mealNumber) {
        this.mealNumber = mealNumber;
    }
    
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
