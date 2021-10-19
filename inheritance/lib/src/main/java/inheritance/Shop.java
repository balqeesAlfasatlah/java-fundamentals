package inheritance;

import java.util.LinkedList;

public class Shop extends Places {

    private String description;


    public Shop(String name ,float stars , float priceCategory , String description){
        super(name ,stars ,priceCategory);
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nShop name: " +  getName() + "\n" + " Rates : " + getStars() + "\n" +
                "price category: " + getPriceCategory() + "$\n" + " description" +
                getDescription() + "\n" + " Review : " + getReviews() + "\n";
    }
}
