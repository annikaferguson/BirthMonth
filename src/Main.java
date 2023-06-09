import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       int birthMonth = 0;

        System.out.println("Enter the number of your birth month: ");
        birthMonth = in.nextInt();

        if(birthMonth == 1)
        {
            System.out.println("Your birth month is: 1");
        }
        else if(birthMonth == 2)
        {
            System.out.println("Your birth month is: 2");
        }
        else if(birthMonth == 3)
        {
            System.out.println("Your birth month is: 3");
        }
        else if(birthMonth == 4)
        {
            System.out.println("Your birth month is: 4");
        }
        else if(birthMonth == 5)
        {
            System.out.println("Your birth month is: 5");
        }
        else if(birthMonth == 6)
        {
            System.out.println("Your birth month is: 6");
        }
        else if(birthMonth == 7)
        {
            System.out.println("Your birth month is: 7");
        }
        else if(birthMonth == 8)
        {
            System.out.println("Your birth month is: 8");
        }
        else if(birthMonth == 9)
        {
            System.out.println("Your birth month is: 9");
        }
        else if(birthMonth == 10)
        {
            System.out.println("Your birth month is: 10");
        }
        else if(birthMonth == 11)
        {
            System.out.println("Your birth month is: 11");
        }
        else if(birthMonth == 12)
        {
            System.out.println("Your birth month is: 12");
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}