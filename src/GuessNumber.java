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
            System.out.println("Gættet korrekt!" + "\nTallet er: " + randomNum);
            int userGuess2 = sc.nextInt();
            System.out.println(userGuess2);
        } else if (userGuess > randomNum) {
            System.out.println("Prøv et lavere tal!");
        } else if (userGuess < randomNum) {
            System.out.println("Prøv et højere tal!");
        }

    }




}