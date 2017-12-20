/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestdeliverymanepice;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author user
 */
public class FastestDeliveryManEpicE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException, Exception {
        // TODO code application logic here
        String choice;
        Scanner sc = new Scanner(System.in);
        
        mainMenu();
        choice = sc.nextLine();
        switch(choice){
            case "1":
                customerMenu();
                
        }
    }
    
    public static void customerOrdering(){
        String choice;
        Scanner sc = new Scanner(System.in);
        
        customerMenu();
        choice = sc.nextLine();
        if(choice == "1"){
            //TODO: Ordering Menu
        }else{
            
        }
    }
    
    public static void mainMenu(){
        System.out.println("Welcome to Fastest Delivery Man\n");
        System.out.println("==Order Scheduling Module==\n");
        System.out.println("Please Select Your Role: \n"
                + "1.Customer \n"
                + "2.Manager\n"
                + "3.Deliveryman \n");
    }
    
    public static void customerMenu(){
        Calendar calDate = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("E, dd/MM/yyyy");
        
        System.out.println("\n==Order Module==\n");
        System.out.println("I would like to order delivery on: \n");
        
        for(int i=1; i<=7; i++){
            if(i==1){
                System.out.println("1. Today");
            }else{
                System.out.println(i + ". " + sdf.format(calDate.getTime()));
            }
            calDate.add(Calendar.DATE, 1);
        }
    }
    
    public static void customerOrderScheduling(){
        System.out.println("I would like my order to be delivered: \n"
                + "1.Now \n"
                + "2.At a specified date and time \n");
    }
}
