import java.util.Scanner;

public class GuessNumber {

   /* int randomNum = (int)(Math.random() * 11);
    Scanner sc = new Scanner(System.in);*/



}

void main(){
    int randomNum = (int)(Math.random() * 11);
    Scanner sc = new Scanner(System.in);

    while (randomNum > 0) {
        System.out.println("Gæt nummer: ");
        int userGuess = sc.nextInt();

        if (userGuess == randomNum) {
            System.out.println("Gættet korrekt!!" + "\nTallet er: " + randomNum);
            break;
        } else if (userGuess > randomNum) {
            System.out.println("Prøv et lavere tal!");
        } else  {
            System.out.println("Prøv et højere tal!");
        }

    }




}