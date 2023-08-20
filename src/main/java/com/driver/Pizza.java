package com.driver;

public class Pizza {

    private int price;
    final private Boolean isVeg;
    private String bill;
    private boolean addExtraCheese =false, extraTopping = false, takeAway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price += 300;
        }else {
            this.price += 400;

        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addExtraCheese){
            addExtraCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraTopping){
            extraTopping = true;
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            takeAway = true;
            this.price += 20;
        }

    }

    public String getBill(){
        // your code goes here
        if(isVeg) {
            bill = "Veg pizza base price = 300\n";
            if(addExtraCheese) bill += "Extra Cheese Added: 80\n";
            if(extraTopping) bill += "Extra Toppings Added: 70\n";
            if(takeAway) bill += "Paperbag Added: 20\n";
        }else{
            bill = "Non-veg pizza base price = 400\n";
            if(addExtraCheese) bill += "Extra Cheese Added: 80\n";
            if(extraTopping) bill += "Extra Toppings Added: 120\n";
            if(takeAway) bill += "Paperbag Added: 20\n";
        }

        bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}
