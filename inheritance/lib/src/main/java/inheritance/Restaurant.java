package inheritance;

import java.util.LinkedList;

public class Restaurant {

    private String name;
    private float stars;
    private float  priceCategory;

    public Restaurant(String name, float stars , float priceCategory){
        this.name = name;
        this.stars = stars;
        this.priceCategory =priceCategory;

    }

    LinkedList <Review> reviews = new LinkedList<>();

    public  LinkedList <Review> getReviews(){
        return reviews;
    }

    public void addReviews(Review reviews){
        this.reviews.add(reviews);
        updateStars();
    }


    public void updateStars(){
        float totalStars =0;
        for (int i=0; i<getReviews().size(); i++){
            totalStars += getReviews().get(i).getStarsNum();
        }
        totalStars = totalStars/ (getReviews().size());
        this.stars = totalStars;
    }

    public String toString(){
        return "Restaurant name: " +  name + " " + " Rates : " + stars + " " + "price category: " + priceCategory + "$";
    }




}
