//class that manage the inventory service

package com.inventory;
public interface InventoryService{

    public void createOrder(String id, int quantity);

    public void getProduct(String id);

    public void getInventory();

    public void getProductByCategory(Category category);

    public void getLastAddedProduct();

}