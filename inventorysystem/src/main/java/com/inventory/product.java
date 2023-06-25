//represent the product in inventorystore
package com.inventory;

class Product {
    private String name;
    private int quantity;
    private double price;
    private String description;
    private Category category;
    private String image;
    private String id;
    private Supplier supplier;


    public ProductBuilder create(){
        return new ProductBuilder();
    }

 public static class ProductBuilder{
    private String name;
    private int quantity;
    private double price;
    private String description;
    private Category category;
    private String image;
    private String id;
    private Supplier supplier;

    public ProductBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilder setQuantity(int quantity){
        this.quantity = quantity;
        return this;
    }

    public ProductBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public ProductBuilder setDescription(String description){
        this.description = description;
        return this;
    }

    public ProductBuilder setCategory(Category category){
        this.category = category;
        return this;
    }

    public ProductBuilder setImage(String image){
        this.image = image;
        return this;
    }

    public ProductBuilder setId(String id){
        this.id = id;
        return this;
    }


    public ProductBuilder setSupplier(Supplier supplier){
        this.supplier = supplier;
        return this;
    }


    public Product build(){
        Product product = new Product();
        product.name = this.name;
        product.quantity = this.quantity;
        product.price = this.price;
        product.description = this.description;
        product.category = this.category;
        product.image = this.image;
        product.id = this.id;
        product.supplier = this.supplier;
        return product;
    }   
}

    public String getName(){
        return name;
    }
    
    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public Category getCategory(){
        return category;
    }

    public String getImage(){
        return image;
    }

    public String getId(){
        return id;
    }

    public Supplier getSupplier(){
        return supplier;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public void setImage(String image){
        this.image = image;
    }


    public void setId(String id){
        this.id = id;
    }       

    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }

    public String toString(){
        return "Product: " + name + " Quantity: " + quantity + " Price: " + price + " Description: " + description + " Category: " + category + " Image: " + image + " Id: " + id + " Supplier: " + supplier;
    }
}