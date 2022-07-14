/* Online Java Compiler and Editor */
package POS;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.lang.String;
import java.lang.Integer;
public  class POS{
     static  List<Product> products = new ArrayList<Product>();
     static List<Product> cartProducts = new ArrayList<Product>();
     public static void main(String []args){
          
          products.add(new Product("Magnolia Fresh Milk", 70.00, 100));
          products.add(new Product("1kg Bag of Flour", 30.00, 100));
          products.add(new Product("Selecta Rocky Road Ice Cream 2L", 280.00, 100));
          displayHeader();
          
          
     }

     private static void displayHeader(){
          int productIndex = 0;
          int productQuantity = 0;
          Product cartProduct;
          System.out.println("Welcome to the POS System");
          System.out.println("Here are our list of Products to choose from:");
          System.out.println("Note : Press 'E' To exit");
          int i =0;
          int j = 0;
          Double orderTotal = 0.0;
          for (Product productsItem : products ) {
               System.out.println(String.valueOf(i) + ": Name: "+productsItem.getName() +" Price: " +String.valueOf(productsItem.getPrice())+"" );
               i++;
          }

          System.out.println("Please choose product to buy:");
          String response = System.console().readLine();
          System.out.println("Please enter quantity:");
          String quantity = System.console().readLine();
          try {
               productIndex = Integer.parseInt(response);
               productQuantity = Integer.parseInt(quantity);
               cartProduct = products.get(productIndex);
               cartProduct.setQuantity(productQuantity);
               cartProducts.add(cartProduct);
         System.out.println("\n\n");
               System.out.println("Success! Here are the products in your cart: ");

          for (Product productsItem : cartProducts ) {
                    System.out.println(String.valueOf(j) + ": Name: "+productsItem.getName() +" Price: " +String.valueOf(productsItem.getPrice())+" Quantity: " + String.valueOf(productsItem.getQuantity())+" Total: "+ String.valueOf(productsItem.getPrice() * productsItem.getQuantity()));
                    j++;
                    orderTotal += productsItem.getPrice() * productsItem.getQuantity();
         }
         
         System.out.println("\n Order total: "+ String.valueOf(orderTotal));
         System.out.println("\n\n");
               displayHeader();
          } catch (Exception e) {
               if (response == "E") {
                    return;
               }
               else{
                    System.out.println("Invalid value is entered");
                    displayHeader();
               }
          }
          
     }
}
