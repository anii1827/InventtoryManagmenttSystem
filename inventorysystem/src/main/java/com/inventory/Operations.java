package com.inventory;

import java.util.List;
import java.util.Scanner;

import com.inventory.Product.ProductBuilder;



public class Operations {
        private Scanner sc;
        private Inventorystore inventorystore;
        private Display display;
        private static Operations operations;

        private Operations(){
            this.inventorystore = new Inventorystore();
            this.sc = new Scanner(System.in);
            this.display = new DisplayImpl();
        }

        public static Operations getInstance(){
            if(operations==null){
                operations = new Operations();
            }
            return operations;
        }

        public void execute(OptionsEnum opt){
            switch(opt){
                case ADD:
                addProduct();
                return;

                case UPDATE:
                updateProduct();
                return;

                case REMOVE:
                removeProduct();
                return;

                case VIEW_INVENTORY:
                viewInventory();
                return;

                case VIEW_PRDUCT:
                viewProudct();
                return;

                case VIEW_PROUDCT_BY_CATEGORY:
                viewProductByCategory();
                return;

                case EXIT:
                System.exit(0);
                return;

                default:
                System.out.println("Select the valid Options");
                return;
            }
        }
    private void viewProductByCategory() {
        System.out.println("Select the Category of the Product");
        for(Category category : Category.values()){
            System.out.println(category.getOption()+":\t" +category.getName());
        }
        Category category = Category.getCategoryByOption(Integer.valueOf(sc.nextLine()));
        if(category==null){
            System.out.println("Invalid Option");
            System.out.println();
            viewProductByCategory();
        }else{
            List<Product> list = this.inventorystore.getProductByCategory(category);
            display.displayInventory(list);
        }
        
    }

    private void addProduct() {
        ProductBuilder product = new Product().create();
        System.out.println("-------------adding a product------------");
        System.out.println("What is the Product Name");
        product.setName(sc.nextLine());
        System.out.println("what is the Product Price");
        product.setPrice(Double.valueOf(sc.nextLine()));
        System.out.println("What is the Product Quantity");
        product.setQuantity(Integer.valueOf(sc.nextLine()));
        System.out.println("Provide some Description");
        product.setDescription(sc.nextLine());
        Category category;
        do{
        System.out.println("Select the Category of the Product");
        for(Category cate : Category.values()){
            System.out.println(cate.getOption()+":\t" +cate.getName());
        }
        category = Category.getCategoryByOption(Integer.valueOf(sc.nextLine()));
        if(category==null){
            System.out.println("Invalid Option");
        }
        }while(category==null);
        product.setCategory(category);
        product.setSupplier(new Supplier().CreatedefaultSupplier());
        this.inventorystore.addProduct(product.build());
        System.out.println("Congrats New Product Added Succesfully");
        System.out.println();
        display.displayProduct(this.inventorystore.lastAddedProudct());
    }

    private void updateProduct() {
        System.out.println("-------------Updating product details------------");
        System.out.println("What is the Product Id");
        String id = sc.nextLine();
        if(this.inventorystore.getProduct(id)==null){
            System.out.println("No Product available with Id : "+id);
            System.out.println();
            updateProduct();
        }
        String opt;
        display.displayProduct(inventorystore.getProduct(id));
        System.out.println("What details you wnat to update? select the number");
        do{
            System.out.println("1. Product Price");
            System.out.println("2. Product Quantity");
            System.out.println("3. Product Description");
            opt = sc.nextLine();
            if("1".equals(opt)){
            System.out.println("New Price");
            this.inventorystore.updateProductPrice(id, Double.valueOf(sc.nextLine()));
            System.out.println();
            System.out.println("New Price Updated Suceesfully");
            System.out.println();
        display.displayProduct(inventorystore.getProduct(id));
        }else if("2".equals(opt)){
            System.out.println("New Quantity");
            this.inventorystore.updateProductQuantity(id, Integer.valueOf(sc.nextLine()));
            System.out.println();
            System.out.println("New Quantity Updated Suceesfully");
            System.out.println();
            display.displayProduct(inventorystore.getProduct(id));
        }else if("3".equals(opt)){
            System.out.println("New Description");
            this.inventorystore.updateProductDescription(id, sc.nextLine());
            System.out.println("New Description Updated Suceesfully");
            System.out.println();
            display.displayProduct(inventorystore.getProduct(id));
        }else{
            System.out.println("Invalid Option! Please select the valid option");
        }
        }while((null==opt) || ( !"1".equals(opt) && !"2".equals(opt) && !"3".equals(opt) ));
        
    }

    private void removeProduct() {
        System.out.println("-------------Remvoing the product from inventory-----------");
        System.out.println("What is the Product Id");
        String id =  sc.nextLine();
        if("".equals(id)){
            System.out.println("Empty Id not allowed here");
            removeProduct();
            return;
        }
        Product product = this.inventorystore.getProduct(id);
        if(product==null){
            System.out.println("No product Available with Product Id : "+id+"! try Again");
            removeProduct();
            return;
        }
        this.inventorystore.removeProduct(id);
        System.out.println("Prouct has been removed Successfully");
        System.out.println();
        display.displayInventory(inventorystore.getInventory());
    }

    private void viewInventory() {
        display.displayInventory(inventorystore.getInventory());
    }

    private void viewProudct() {
        System.out.println("-------------View Product-----------");
        System.out.println("What is the Product Id");
        String id =  sc.nextLine();
        display.displayProduct(inventorystore.getProduct(id));
    }
}

        

        

        
