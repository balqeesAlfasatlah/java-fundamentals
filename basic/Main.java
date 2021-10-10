
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Main
{

public  static String Pluralize(int num , String word){
        if(num == 0 || num >1){
           return("I own " + num +" " + word + "s" + ".");
        }else{
            return("I own " + num +" " + word  + ".");
        }
    }




public static void flipNHeads(int n){
        int headNum =0;
        int flipsNum =0;

        
        while(headNum !=n) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                System.out.println("Tail");
                flipsNum++;
            }
            if (randomNum >=0.5) {
                System.out.println("Head");
                headNum++;
                flipsNum++;
            }
        }
        System.out.println("It took " + flipsNum + " flips to flip " + n + " heads in a row.");
    }
     

   



    public static void clock() {
       
        
        while(true){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            
         LocalDateTime datetime1 = LocalDateTime.now();  
         DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");  
         String formatDateTime = datetime1.format(format);   
         System.out.println(formatDateTime);
            

    
    }
    
    }
	public static void main(String[] args) {
         System.out.println(Pluralize(1,"cat"));
         System.out.println(Pluralize(3,"dog"));
         flipNHeads(5);  
	  clock();


}
}












