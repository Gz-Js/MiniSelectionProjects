import java.util.Scanner;
public class Lottery
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        int numTens;
        int numOnes;

        int lotto = (int)((Math.random() * 90) + 10) ;
        int lottoTens = (lotto - (lotto % 10))/10;
        int lottoOnes = (lotto % 10);

        System.out.print("Enter a two digit number: ");
        num = scan.nextInt();
        numTens = (num - (num % 10))/10;
        numOnes = (num % 10);

        System.out.println("The lotto number is: " + lotto);

        if (num == lotto)
        {
            System.out.println("YOU GOT IT!!! \nYou win the jackpot of $10,000!");
        }
        else if (numOnes == lottoTens && numTens == lottoOnes)
        {
            System.out.println("You got both digits correct,\nYou win $2,000!");
        }
        else if ((numOnes == lottoOnes || numOnes == lottoTens) || (numTens == lottoOnes || numTens == lottoTens))
        {
            System.out.println("You got one digit correct.\nYou win $500!");
        }
        else
        {
            System.out.println("You didn't win :(");
        }
    }

}
