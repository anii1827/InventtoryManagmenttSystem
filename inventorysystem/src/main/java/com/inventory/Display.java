package com.inventory;

import java.time.LocalDate;
import java.util.List;

public abstract class Display {
    protected void displaytitle(){
        System.out.println();
        System.out.println("\t\t\t\tWelcome to Inventory Management System\t\t\t\t\t Date :"+LocalDate.now().toString());
        System.out.println();
        }
        
        protected void displayHeader(){
        System.out.println("=============================================================================================================================");
        System.out.printf("%15s %15s %25s %20s %10s %20s",  "Id", "Name", "Price" , "Quantity" , "Category" , "Description");
        System.out.println();
        System.out.println("=============================================================================================================================");
        }

        public abstract void displayInventory(List<Product> inventory);
        public abstract void displayProduct(Product p);
}
