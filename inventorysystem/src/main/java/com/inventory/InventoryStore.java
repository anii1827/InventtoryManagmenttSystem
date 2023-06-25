//contains the product inventory
package com.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Inventorystore{
    private static Map<String, Product> inventory;
    private static int newId;
    public Inventorystore(){
        if(inventory == null){
            newId = 1;
            inventory = new HashMap<String, Product>();
            init();
        }
    }

    public void addProduct(Product product){
        product.setId(String.valueOf(newId++));
        inventory.put(product.getId(),product);
    }

    

    public void removeProduct(String id){
        inventory.remove(id);
    }

    public ArrayList<Product> getInventory(){
        return new ArrayList<Product>(inventory.values());
    }

    public Product lastAddedProudct(){
        return inventory.get(String.valueOf(newId-1));   
    }

    public void setInventory(ArrayList<Product> inv){
        for(Product product : inv){
            inventory.put(String.valueOf(inventory.size()+1), product);
        }
    }

    public Product getProduct(String id){
        return inventory.get(id);
    }


    public void updateProductQuantity(String id, int quantity){
        if(quantity > 0){
            inventory.get(id).setQuantity(quantity);
        }
        else{
            inventory.remove(id);
            System.out.println("Product removed from inventory as quantity is 0");
        }
        
    }

    public void updateProductPrice(String id, double price){
        inventory.get(id).setPrice(price);
    }


    public void updateProductDescription(String id, String description){
        inventory.get(id).setDescription(description);
    }

    public void updateProductImage(String id, String image){
        inventory.get(id).setImage(image);
    }   

    public List<Product> getProductByCategory(Category category){
        List<Product> list = new ArrayList<>();
        for(Product p : inventory.values()){
            if(p.getCategory().equals(category)){
                list.add(p);
            }
        }
        return list;
    }

     private void init() {    
            //bajaj fan product adding to inventory
            addProduct(new Product().create().
                        setName("BAJAJ FAN").setDescription("Bajaj fan with 3 blades").
                        setPrice(1000.0).setQuantity(15).
                        setCategory(Category.ELECTRONICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //havells fan product adding to inventory
            addProduct(new Product().create().
                        setName("Havells FAN").setDescription("havells fan with 3 blades").
                        setPrice(1000.0).setQuantity(15).
                        setCategory(Category.ELECTRONICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //sony tv product adding to inventory
            addProduct(new Product().create().
                        setName("Sony TV").setDescription("Sony 45 Inch LCD TV with Inbuilt Sony Speaker").
                        setPrice(650.0).setQuantity(50).
                        setCategory(Category.ELECTRONICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());                        
            
            //Fortune Oil product adding to inventory   
            addProduct(new Product().create().
                        setName("Fortune Oil").setDescription("Fortune Oil packet of 250ltr. good for health").
                        setPrice(1000.0).setQuantity(15).
                        setCategory(Category.GROCERY).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());        

            //Aashirvaad Atta product adding to inventory
            addProduct(new Product().create().
                        setName("Aashirvaad Atta").setDescription("Aashirvaad Atta packet of 5kg. good for health").
                        setPrice(550.0).setQuantity(15).
                        setCategory(Category.GROCERY).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //Tata Salt product adding to inventory
            addProduct(new Product().create().
                        setName("Tata Salt").setDescription("Tata Salt packet of 1kg. good for health").
                        setPrice(20.0).setQuantity(15).
                        setCategory(Category.GROCERY).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //Dove Shampoo product adding to inventory
            addProduct(new Product().create().
                        setName("Dove Shampoo").setDescription("Dove Shampoo packet of 1ltr. good for hair").
                        setPrice(200.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());
            
            //Dove Soap product adding to inventory
            addProduct(new Product().create().
                        setName("Dove Soap").setDescription("Dove Soap packet of 100gm. good for skin").
                        setPrice(20.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //Colgate Toothpaste product adding to inventory
            addProduct(new Product().create().
                        setName("Colgate Toothpaste").setDescription("Colgate Toothpaste packet of 100gm. good for teeth").
                        setPrice(50.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());


            //Dettol Soap product adding to inventory
            addProduct(new Product().create().
                        setName("Dettol Soap").setDescription("Dettol Soap packet of 100gm. good for skin").
                        setPrice(20.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //Dettol Handwash product adding to inventory
            addProduct(new Product().create().
                        setName("Dettol Handwash").setDescription("Dettol Handwash packet of 100gm. good for skin").
                        setPrice(100.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //Dettol Sanitizer product adding to inventory
            addProduct(new Product().create().
                        setName("Dettol Sanitizer").setDescription("Dettol Sanitizer packet of 100gm. good for skin").
                        setPrice(50.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //Dettol Liquid product adding to inventory
            addProduct(new Product().create().
                        setName("Dettol Liquid").setDescription("Dettol Liquid packet of 100gm. good for skin").
                        setPrice(100.0).setQuantity(15).
                        setCategory(Category.COSMETICS).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //zara shirt product adding to inventory
            addProduct(new Product().create().
                        setName("Zara Shirt").setDescription("Zara Shirt of Size Medium.").
                        setPrice(750.0).setQuantity(15).
                        setCategory(Category.CLOTHING).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //zara jeans product adding to inventory
            addProduct(new Product().create().
                        setName("Zara Jeans").setDescription("Zara Jeans of Size 32.").
                        setPrice(3000.0).setQuantity(15).
                        setCategory(Category.CLOTHING).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //zara tshirt product adding to inventory
            addProduct(new Product().create().
                        setName("Zara Tshirt").setDescription("Zara Tshirt of Size Medium.").
                        setPrice(500.0).setQuantity(15).
                        setCategory(Category.CLOTHING).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //zara shoes product adding to inventory
            addProduct(new Product().create().
                        setName("Zara Shoes").setDescription("Zara Shoes of Size 9.").
                        setPrice(2000.0).setQuantity(15).
                        setCategory(Category.CLOTHING).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //zara belt product adding to inventory
            addProduct(new Product().create().
                        setName("Zara Belt").setDescription("Zara Belt of Size Medium.").
                        setPrice(500.0).setQuantity(15).
                        setCategory(Category.CLOTHING).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //zara watch product adding to inventory
            addProduct(new Product().create().
                        setName("Zara Watch").setDescription("Zara Watch of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.CLOTHING).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //IKEA product adding to inventory
            addProduct(new Product().create().
                        setName("IKEA Table").setDescription("IKEA Table of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //IKEA product adding to inventory
            addProduct(new Product().create().
                        setName("IKEA Chair").setDescription("IKEA Chair of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //IKEA product adding to inventory
            addProduct(new Product().create().
                        setName("IKEA Bed").setDescription("IKEA Bed of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //IKEA product adding to inventory
            addProduct(new Product().create().
                        setName("IKEA Sofa").setDescription("IKEA Sofa of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //home town product adding to inventory
            addProduct(new Product().create().
                        setName("Hometown Table").setDescription("Hometown Table of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());
            
            //home town product adding to inventory
            addProduct(new Product().create().
                        setName("Hometown Chair").setDescription("Hometown Chair of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());
            
            //home town product adding to inventory
            addProduct(new Product().create().
                        setName("Hometown Bed").setDescription("Hometown Bed of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

            //home town product adding to inventory
            addProduct(new Product().create().
                        setName("Hometown Sofa").setDescription("Hometown Sofa of Size Medium.").
                        setPrice(5000.0).setQuantity(15).
                        setCategory(Category.FURNITURE).setImage("https://images").
                        setSupplier(new Supplier().CreatedefaultSupplier()).build());

    }
}