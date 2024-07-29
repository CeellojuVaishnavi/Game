import java.util.Scanner;
import java.util.Random;
public class RockPS {
    public static void main(String[] args){
        Scanner ch=new Scanner (System.in);
        Random com=new Random();
        int i=1;
        int coms=0,users=0;
        System.out.println("How many times you want to play :");
        int c=ch.nextInt();

        while(i<=c)
        {
        System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for scissor :");
        int choice=ch.nextInt();
        int comch=(com.nextInt(3))+1;
        if (choice==comch){
            System.out.println("Both of you had same choice");

        }
        else{
        if (choice==1){
            if(comch==2){
                System.out.println("Computer choosed Paper ...You lost a point");
                coms+=1;
            }
            else{
                System.out.println("Computer choosed Scissors...You got a point");
                users+=1;
            }
        }
        else if(choice==2){
            if(comch==1){
                System.out.println("Computer choosed Rock...You got a point");
                users+=1;
            }
            else{
                System.out.println("Computer choosed Scissors ....You lost a point");
                coms+=1;
            }
        }
        else{
            if (comch==1){
                System.out.println("Computer choosed Rock....You lost a point");
                coms+=1;
            }
            else{
                System.out.println("Computer choosed Paper....You got a point");
                users+=1;
            }
        }
    }
    i+=1;
    System.out.printf("Your score : %d\nComputer score :%d\n",users,coms);
}
System.out.println("Game completed");
if(coms==users){
    System.out.println("Equal scores");
}
else{
    if(coms>users){
        System.out.println("Shut!!!...You lost the game");
    }
    else{
        System.out.println("Hurryy!!!!...You won");
    }
}
    }
}
