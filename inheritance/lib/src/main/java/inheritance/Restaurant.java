package inheritance;

import java.util.LinkedList;

public class Restaurant extends Places{

    public Restaurant(String name, float stars , float priceCategory){
        super(name,stars,priceCategory);

    }


    public String toString(){
        return "\nRestaurant name: " +  getName() + "\n " + " Rates : " + getStars() + "\n" + "price category: " + getPriceCategory() + "$" + "\n";
    }




}
