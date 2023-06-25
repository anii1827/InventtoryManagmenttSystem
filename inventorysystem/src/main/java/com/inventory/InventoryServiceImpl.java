//concreate implementation of InventoryService interface
package com.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryServiceImpl implements InventoryService{

    private static Inventorystore inventory; 
    private static Display display;
    
    public InventoryServiceImpl(){
        if(inventory == null){
            inventory = new Inventorystore();
        }
        display = new  DisplayImpl();
    }
    @Override
    public void createOrder(String id, int quantity) {
         Product product = inventory.getProduct(id);
        if(product.getQuantity()>=quantity){
            inventory.updateProductQuantity(id, product.getQuantity()-quantity);
            System.out.println("Yur Order of Proudct "+product.getName() +"completed. Thanks For Visiting");
        }else{
            System.out.println("Currently we have only "+product.getQuantity()+" stock of the product "+product.getName());
            System.out.println("Chagne the quantity and try again! Thanks");
        }
    }

    @Override
    public void getProduct(String id) {
        Product product = inventory.getProduct(id);
        if(product==null){
            System.out.println();
            System.out.println("No Product found with id : "+id);
        }else{
            display.displayProduct(product);
        }
        
    }

    @Override
    public void getInventory() {
        ArrayList<Product> inventory2 = inventory.getInventory();
        display.displayInventory(inventory2);
    }
    
   
    @Override
    public void getProductByCategory(Category category) {    
        List<Product> list = inventory.getProductByCategory(category);
        if(list.size()==0 || list.isEmpty()){
            System.out.println();
            System.out.println("No Product found with "+category.getName()+" Category");
        }else{
            display.displayInventory(list);
        } 
    }
    @Override
    public void getLastAddedProduct() {
        Product lastAddedProudct = inventory.lastAddedProudct();
        display.displayProduct(lastAddedProudct);
    }
}