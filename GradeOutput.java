import java.util.Scanner;
public class GradeOutput
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int grade;

        System.out.print("Enter your grade as an integer: ");
        grade = scan.nextInt();

        if (98 <= grade && grade <= 100)
        {
            System.out.println("A+");
        }
        else if (93 <= grade && grade <= 97)
        {
            System.out.println("A");
        }
        else if (90 <= grade && grade <= 92)
        {
            System.out.println("A-");
        }
        else if (88 <= grade && grade <= 89)
        {
            System.out.println("B+");
        }
        else if (83 <= grade && grade <= 87)
        {
            System.out.println("B");
        }
        else if (80 <= grade && grade <= 82)
        {
            System.out.println("B-");
        }
        else if (78 <= grade && grade <= 79)
        {
            System.out.println("C+");
        }
        else if (73 <= grade && grade <= 77)
        {
            System.out.println("C");
        }
        else if (70 <= grade && grade <= 72)
        {
            System.out.println("C-");
        }
        else if (68 <= grade && grade <= 69)
        {
            System.out.println("D+");
        }
        else if (63 <= grade && grade <= 67)
        {
            System.out.println("D");
        }
        else if (60 <= grade && grade <= 62)
        {
            System.out.println("D-");
        }
        else if (grade <= 59)
        {
            System.out.println("F");
        }

    }

}
