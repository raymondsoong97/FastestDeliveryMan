/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestdeliveryman;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author pc
 */
public class FastestDeliveryMan implements Serializable{

    /**
     * @param args the command line arguments
     */
    String restaurant;
    String FoodName;

   

    

    
    public FastestDeliveryMan(String restaurant,String FoodName) {
    this.restaurant = restaurant;
    this.FoodName = FoodName;
    
  }

    
    
    
    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String Restaurant) {
        this.restaurant = Restaurant;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }
    

      
    public String toString() {
    return String.format("",restaurant, FoodName);
  }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
