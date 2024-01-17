package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addcheese;
    private boolean addtoppings;
    private boolean takeaway;

    private boolean billgen;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.addcheese = false;
        this.addtoppings = false;
        this.takeaway=false;
        this.billgen=false;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!addcheese) {
            this.price = price + 80;
            addcheese = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!addtoppings) {
            if (isVeg) {
                this.price = price + 70;
            } else {
                this.price = price + 120;
            }
            addtoppings = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if(!takeaway) {
            this.price += 20;
            this.takeaway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if(!billgen){
            this.bill = Integer.toString(this.price);
            this.billgen=true;
        }
        return this.bill;
    }
}

