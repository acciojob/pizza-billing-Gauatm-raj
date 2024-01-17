package com.driver;

public class DeluxePizza extends Pizza {
    private int price;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // your code goes here
        if(isVeg){
             this.price=getPrice()+150;
        }else{
             this.price=getPrice()+200;
        }
        setAddcheese(true);
        setAddtoppings(true);
        setTakeaway(true);
        setPrice(this.price);
    }
}
