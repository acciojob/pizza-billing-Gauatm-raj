package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addcheese;
    private boolean addtoppings;
    private boolean takeaway;

    private boolean billgen;
//    Base Price Of The Pizza: 300
//    Extra Cheese Added: 80
//    Extra Toppings Added: 70
//    Paperbag Added: 20
//    Total Price: 470


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            this.price = 300;
            this.bill="Base Price Of The Pizza: "+300+"\n";
        } else {
            this.price = 400;
            this.bill="Base Price Of The Pizza: "+300+"\n";
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
            this.bill+="Extra Cheese Added: " + 80+"\n";
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if ((addtoppings==false && addcheese==false) || (addcheese==true && addtoppings==false) ) {
            if (isVeg) {
                this.price = price + 70;
                this.bill+="Extra Toppings Added: " + 70+"\n";
            } else {
                this.price = price + 120;
                this.bill+="Extra Toppings Added: " + 120+"\n";
            }
            addtoppings = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if(!takeaway) {
            this.price += 20;
            this.takeaway = true;
            this.bill+="Paperbag Added: " + 20+"\n";
        }
    }

    public String getBill() {
        // your code goes here
        if(!billgen){

            this.bill+="Total Price: "+this.price+"\n";
            this.billgen=true;
        }
        return this.bill;
    }
}

