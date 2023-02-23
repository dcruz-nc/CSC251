package restaurantordersystem;

public class SpecialMeal extends Meal {
    private String specialDescription;

    public SpecialMeal(int mealNumber, String description, double price, String specialDescription) {
        super(mealNumber, description, price);
        this.specialDescription = specialDescription;
    }
    
    public String getSpecialDescription() {
        return this.specialDescription;
    }
    public void setSpecialDescription(String specialDescription) {
        this.specialDescription = specialDescription;
    }
}
