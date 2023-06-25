//class to start interacting with the system
package com.inventory;

import java.util.Scanner;

class Inventory {
    private Scanner sc;
    private Operations operation;

    public Inventory(){
       this.sc = new Scanner(System.in);
       this.operation = Operations.getInstance();
    }

    public void init(){
        System.out.println("****************Welcome to Inventory Managment System.************");
        System.out.println("Choose the Option");
        for(OptionsEnum opt : OptionsEnum.values()){
            System.out.println(opt.getOption()+":\t"+opt.getDescription());
        }
        String opt = sc.nextLine();
        OptionsEnum option = OptionsEnum.getEnumByOption(Integer.valueOf(opt));
        if(option==null){
            System.out.println("Invalid Option! select The valid Option");
        }else{
            operation.execute(option);
        }
        init();
    }
}