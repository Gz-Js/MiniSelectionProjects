import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int play;

        System.out.print("Let's play Rock, Paper, Scissors!\n" + "Input (0) for rock, (1) for paper, and (2) for scissors: ");
        play = scan.nextInt();

        int aI = (int)(Math.random() * 3);
        System.out.println("Computer chose: " + aI);

        if (play == aI)
        {
            System.out.println("It's a tie!");
        }
        else if (play == 0 && aI == 1)
        {
            System.out.println("Paper beats rock, you lose!");
        }
        else if (play == 1 && aI == 0)
        {
            System.out.println("Paper beats rock, you win!");
        }
        else if (play == 0 && aI == 2)
        {
            System.out.println("Rock beats scissors, you win!");
        }
        else if (play == 2 && aI == 0)
        {
            System.out.println("Rock beats scissors, you lose!");
        }
        else if (play == 1 && aI == 2)
        {
            System.out.println("Scissors beats paper, you lose!");
        }
        else if (play == 2 && aI == 1)
        {
            System.out.println("Scissors beats paper, you lose!");
        }
        else if (play >= 3)
        {
            System.out.println("That's not an option! You lose!");
        }
    }

}
