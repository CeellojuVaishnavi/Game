import java.util.Scanner;
import java.util.Random;
public class Game {
    public int count=0;
    public int ran,g;
    public Game(){
        Random r=new Random();
        int ra=r.nextInt(101);
        this.ran=ra;
        //System.out.println(this.ran);
        //userIn();
    }
    public void userIn(){
        count+=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Guess any number from 1 to 100 :");
        int ga=s.nextInt();
        this.g=ga;
        iscorrect();
    }
    public void iscorrect(){
        if(ran==g){
            System.out.printf("\nWoww....You guessed it\nYou done it in %d guesses\n",count);
        }
        else if(ran<g){
            System.out.println("Lower number please ");
            userIn();
        }
        else{
            System.out.println("Higher number please ");
            userIn();
        }
    }
    public static void main(String[] args){
        Game f=new Game();
        f.userIn();
    }
}
