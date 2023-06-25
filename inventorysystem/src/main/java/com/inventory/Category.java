//maintain the  category of the product

package com.inventory;
enum Category{
    ELECTRONICS(1,"Electronics"),
    FURNITURE(2,"Furniture"),
    GROCERY(3,"Grocery"),
    CLOTHING(4,"Clothing"),
    OTHER(5,"Other"),
    FOOD(6,"Food"),
    COSMETICS(7,"Cosmetics");


    private int option;
    private String name;

    Category(int opt,String name){
        this.name = name;
        this.option = opt;
    }

    public String getName() {
        return name;
    }    

    public int getOption(){
        return option;
    }

    public static Category getCategoryByOption(int opt){
        for(Category category : Category.values()){
            if(category.getOption()==opt)
            return category;
        }
        return null;
    }
}



