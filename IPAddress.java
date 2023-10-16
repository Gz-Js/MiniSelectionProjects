import java.util.Scanner;
public class IPAddress
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int oct1;
        int oct2;
        int oct3;
        int oct4;

        System.out.println("Please enter the first octet of your IP Address:");
        oct1 = scan.nextInt();
        System.out.println("Please enter the second octet of your IP Address:");
        oct2 = scan.nextInt();
        System.out.println("Please enter the third octet of your IP Address:");
        oct3 = scan.nextInt();
        System.out.println("Please enter the fourth octet of your IP Address:");
        oct4 = scan.nextInt();

        if (oct1 < 0 || oct1 > 255)
        {
            System.out.println("Octet 1 is incorrect");
            oct1 = -1;
        }
        if (oct2 < 0 || oct2 > 255)
        {
            System.out.println("Octet 2 is incorrect");
            oct2 = -1;
        }
        if (oct3 < 0 || oct3 > 255)
        {
            System.out.println("Octet 3 is incorrect");
            oct3 = -1;
        }
        if (oct4 < 0 || oct4 > 255)
        {
            System.out.println("Octet 4 is incorrect");
            oct4 = -1;
        }
        if (oct1 != -1 && oct2 != -1 && oct3 != -1 && oct4 != -1)
        {
            System.out.println("IP Address: " + oct1 + "." + oct2 + "." + oct3 + "."  + oct4);
        }
    }

}
