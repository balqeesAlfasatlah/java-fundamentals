package inheritance;

public class Review {

    private  String body;
    private  String author;
    private int starsNum;

    public Review(String body , String author , int starsNum){
        this.body = body;
        this.author = author;

        if(starsNum >= 5){
            this.starsNum =5;
        }else if(starsNum < 0){
            this.starsNum = 0;
        }else {
            this.starsNum = starsNum;
        }

    }

    public int getStarsNum(){
        return starsNum;
    }

    public String toString(){
        return "Author : " + " " + author +  "," + " rates : " + " " + starsNum + "," + " notes: " + body;
    }
}

