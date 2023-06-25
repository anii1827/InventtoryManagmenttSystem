package com.inventory;

public enum OptionsEnum {
        ADD(1,"Add a Product to Inventory"),
        UPDATE(2,"Update a Product to Inventory"),
        REMOVE(3,"Remove a Product from Inventory"),
        VIEW_INVENTORY(4, "View Inventory"),
        VIEW_PRDUCT(5, "View Proudct"),
        VIEW_PROUDCT_BY_CATEGORY(6, "View Proudcy Category"),
        EXIT(7, "exit");

        private int option;
        private String description;
        
        OptionsEnum(int option, String desc){
            this.description = desc;
            this.option = option;
        }

        public int getOption(){
            return this.option;
        }

        public String getDescription(){
            return this.description;
        }

        public static OptionsEnum getEnumByOption(int opt){
            for(OptionsEnum option : OptionsEnum.values()){
                if(option.getOption()==opt) 
                return option;
            }
            return null;
        }
}
