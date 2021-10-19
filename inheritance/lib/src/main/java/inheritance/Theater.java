package inheritance;

import java.util.ArrayList;

public class Theater extends Places{
    private ArrayList<String> movies = new ArrayList<String>();

    public Theater(String name, float stars , float priceCategory){
        super(name,stars,priceCategory);
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public void addMovie (String movieName){
        movies.add(movieName);
    }

    public void removeMovie (String movieName){
        movies.remove(movieName);
    }

    @Override
    public String toString() {
        return "\nTheater name : " + getName() + "\n" + " ,Rates : " + getStars() + "\n" +
                "Movies for today : "  + movies + "\n" + " Review :" + getReviews() + "\n";
    }
}
