package inheritance;

public class ReviewMovie extends Review {

    private String movie;

    public ReviewMovie(String body, String author, int starsNum, String movie) {
        super(body, author, starsNum);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}