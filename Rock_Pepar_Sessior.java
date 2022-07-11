import java.util.Scanner;
import java.util.Random;
public class Rock_Pepar_Sessior{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("\nWellcome to the Rock Pepar Sessior game");
        System.out.println();
        System.out.println("It's your " + i + " chance");
        System.out.println("Enter your choise...\n0 For Rock\n1 For pepar\n2 For Sessior");
        int userinput = sc.nextInt();
        Random ran = new Random();
        int cominput = ran.nextInt(3);
        if(cominput == 0){
            System.out.println("computer choos Rock");
        }
        if(cominput == 1){
            System.out.println("computer choos pepar");
        }
        if(cominput == 2){
            System.out.println("computer choos Sessior");
        }

        if((cominput == 0 && userinput == 1 )|| (cominput == 1 && userinput == 2)
        ||(cominput == 2 && userinput == 0)){
            System.out.println("You win..");
        }
        else if((cominput == 0 && userinput == 0 )|| (cominput == 1 && userinput == 1)
        ||(cominput == 2 && userinput == 2)){
            System.out.println("It's Draw..");
        }
        else{
            System.out.println("You loss..");
            i++;
        } 
        sc.close();
    }
}