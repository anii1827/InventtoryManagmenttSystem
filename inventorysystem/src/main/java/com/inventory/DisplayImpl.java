package com.inventory;

import java.util.List;

public class DisplayImpl extends Display{

    @Override
    public void displayInventory(List<Product> inventory) {
        this.displaytitle();
        this.displayHeader();
        for(Product p : inventory){
            if(p.getDescription().length()<10){
                System.out.printf("%15s %18s %21s %15s %15s %15s",  p.getId(), p.getName(), p.getPrice() , p.getQuantity() , p.getCategory(), p.getDescription());
            }else if(p.getDescription().length()>=10 && p.getDescription().length()<15){
                System.out.printf("%15s %18s %21s %15s %15s %25s",  p.getId(), p.getName(), p.getPrice() , p.getQuantity() , p.getCategory(), p.getDescription());
            }else if(p.getDescription().length()>=15 && p.getDescription().length()<20){
                System.out.printf("%15s %18s %21s %15s %15s %30s",  p.getId(), p.getName(), p.getPrice() , p.getQuantity() , p.getCategory(), p.getDescription());
            }
            else{
                System.out.printf("%15s %18s %21s %15s %15s %35s",  p.getId(), p.getName(), p.getPrice() , p.getQuantity() , p.getCategory(), p.getDescription());
            }
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println();
        System.err.println("Total Number of Product" + "\t:\t" + inventory.size());
        System.out.println();

    }

    @Override
    public void displayProduct(Product p) {
        this.displaytitle();
        this.displayHeader();
        System.out.printf("%15s %18s %21s %15s %15s %30s",  p.getId(), p.getName(), p.getPrice() , p.getQuantity() , p.getCategory(), p.getDescription());
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
        System.err.println("Total cost" + "\t:\t" + p.getQuantity()*p.getPrice());
        System.out.println();
    }
        
}
