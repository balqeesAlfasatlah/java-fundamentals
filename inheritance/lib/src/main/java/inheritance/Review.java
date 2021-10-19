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


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStarsNum(){
        return starsNum;
    }

    public void setStarsNum(int starsNum) {
        this.starsNum = starsNum;
    }


    public String toString(){
        return "\nAuthor: " + author + "\n" + " rates: " + starsNum + "\n" + " notes: " + body + "\n";
    }
}

