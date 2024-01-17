package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addcheese;
    private boolean addtoppings;
    private boolean takeaway;

    public boolean isTakeaway() {
        return takeaway;
    }

    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public boolean isAddcheese() {
        return addcheese;
    }

    public void setAddcheese(boolean addcheese) {
        this.addcheese = addcheese;
    }

    public boolean isAddtoppings() {
        return addtoppings;
    }

    public void setAddtoppings(boolean addtoppings) {
        this.addtoppings = addtoppings;
    }

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
        this.bill = Integer.toString(this.price);
        return this.bill;
    }
}

