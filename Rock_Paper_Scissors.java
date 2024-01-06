//Simplest Rock Paper Scissors with the computer. Although not the best, it works.
//So the thing is that the program is a bit lazy so it will only give out its Rock, Paper or Scissors only after you have selected your choice. But no problem cause it can not see your answer. Its just not punctual to give its choice on time.
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main (String[] args){

        System.out.println("Lets play rock paper scissors ");
        System.out.print("Best of : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        System.out.println(" \"1 for Rock\" \n \"2 for Paper\" \n \"3 for Scissors\"");
        int i;
        int you = 0;
        int me = 0;
        int da = 0;
        for(i=1;i<=n;i++){

            System.out.println("Round "+i);
            System.out.print("Your turn: ");
            int rps = sc.nextInt();
            switch(rps){
                case 1 -> System.out.print("So, Rock huh.");
                case 2 -> System.out.print("So, Paper huh.");
                case 3 -> System.out.print("So, Scissors huh.");
                default -> System.out.println("1-3 only man");
            }
            System.out.print(" Here comes mine\n.........\n ");
        Random rn = new Random();
        int ran = rn.nextInt(1,4);
            switch (ran) {
                case 1 -> System.out.println("Rock");
                case 2 -> System.out.println("Paper");
                case 3 -> System.out.println("Scissors");
                default -> System.out.println("although we dont need it ");

            }


            if (rps>ran ){
                System.out.println("You won. Round "+i+" is yours.");
                you++;
            }
            else if (rps==1 && ran==3) {
                System.out.println("You won. Round "+i+" is yours");
                you++;

            }
            else if(rps==ran){
                System.out.println("Draw. Round "+i+" is a draw.");
                da++;
                }
            else{
                System.out.println("I won Round "+i+".");
                me++;
            }
                System.out.println("\n\n");

        }
        if(you>me){
            System.out.println("Out of "+n+" rounds, you won "+you+" rounds and I won "+me+" round. "+da+" draw(s) . So, you are the winner. CONGRATULATIONSSS!!!!!");
        }
        else if(you==me){
            System.out.println(da+" of "+n+" are draw. You won "+you+" round(s) and I won "+me+" rounds. Basically it's a draw. So play again?");
        }
        else{
            System.out.println("Out of "+n+" rounds, I won "+me+" rounds and you won "+you+" round. "+da+" draw(s). So, I am the winner. HEHAHAHAHAAA");

        }
    }
}
