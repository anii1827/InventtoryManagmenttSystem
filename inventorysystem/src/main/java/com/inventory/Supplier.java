//represent the supplier of the product

package com.inventory;

public class Supplier {
    private String name;
    private String id;
    private String address;
    private String phone;
    private String email;

    public Supplier(){
        name = "";
        id = "";
        address = "";
        phone = "";
        email = "";
    }

    public Supplier CreatedefaultSupplier(){
        this.name = "Anll";
        this.id = "1";
        this.address = "supplier, pune, 411014 maharashtra";
        this.phone = "9785243614";
        this.email = "supplier@gmail.com";  
        return this;
    }

    public Supplier(String name, String id, String address, String phone, String email){
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }


    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }   

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setphone(String phone){
        this.phone = phone;
    }

    public String toString(){
        return "Supplier Name: " + name + "\n" +
               "Supplier ID: " + id + "\n" +
               "Supplier Address: " + address + "\n" +
               "Supplier Phone: " + phone + "\n" +
               "Supplier Email: " + email + "\n";
    }
}
