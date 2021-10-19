package inheritance;

import java.util.LinkedList;

public class Restaurant extends Places{

    public Restaurant(String name, float stars , float priceCategory){
        super(name,stars,priceCategory);

    }


    public String toString(){
        return "Restaurant name: " +  getName() + " " + " Rates : " + getStars() + " " + "price category: " + getPriceCategory() + "$" ;
    }




}
