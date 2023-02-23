package restaurantordersystem;

public class Main {
  
    public static void main(String[] args) {
     
        //MenuMeal =  mealNumber,  description, price, priceOfSides
        //SpecialMeal = mealNumber, description, price, specialDescription
        
         System.out.println("Welcome to my restaurant!");
       
        System.out.println(); //space
        
        MenuMeal mm1 = new MenuMeal(45, "Deluxe burger with fries and salad(extra side)"
                , 11.99, 3.99);
                         
        
        SpecialMeal sm1 = new SpecialMeal(46, "Triple patty burger with fries and drink",
                12.99, "World Cup Final Special: A triple patty burger toppped with a blend of cheddar, bacon"
                        + ", lettuce and tomato. Medium fries with any choice of drink!");
        
        double temp;
        
        temp = mm1.getPrice() + mm1.getPriceOfSides();
        
        System.out.println("Showing MenuMeal Object(with added extra side price)...");
        System.out.printf("Meal Number: %d\nDescription: %s\nPrice: $%.2f\n"
        , mm1.getMealNumber(), mm1.getDescription(), temp);
       
        System.out.println();//space
     
        System.out.println("Showing SpecialMeal Object...");
        System.out.printf("Meal Number: %d\nDescription: %s\nPrice: $%.2f\nSpecial Description: %s\n"
        ,sm1.getMealNumber(), sm1.getDescription(), sm1.getPrice(), sm1.getSpecialDescription());   
    }
}
