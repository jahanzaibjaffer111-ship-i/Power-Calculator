import java.util.Scanner;
public class power_calculator
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) 
        {
            System.out.println("Hello");
            System.out.println("Welcome to Power Calculator");
            while(true)
            {
                System.out.println("Type Number");
                double no=read.nextDouble();
                if(no>0)
                {
                    System.out.println(" ");
                    System.out.println("Type Power");
                    int power=read.nextInt();
                    if(power>0)
                    {
                        double b=no;
                        if(power==1)
                        {
                            System.out.println(" ");
                            System.out.println("Value is");
                            System.out.println(b);
                        }
                        if (power!=1)
                        {
                            while(power>1)
                            {
                                no=no*b;
                                power--;
                            }
                            System.out.println(" ");
                            System.out.println("Value is");
                            System.out.println(no);
                        }
                        System.out.println(" ");
                    }
                    if(power<0)
                    {
                        System.out.println("power can't be Negative");
                        System.out.println("Try again");
                        System.out.println(" ");
                    }
                    if(power==0)
                    {
                        System.out.println("power can't be Zero");
                        System.out.println("Try again");
                        System.out.println(" ");
                    }
                }
                if(no==0)
                {
                    System.out.println("Number can't be zero");
                    System.out.println("Try again");
                    System.out.println(" "); 
                }
                if(no<0)
                {
                    System.out.println("Number can't be Negative");
                    System.out.println("Try again");
                    System.out.println(" "); 
                }
                System.out.println("Do you want to restart Calculator Type yes or no");
                read.nextLine();
                String ans=read.nextLine();
                if(ans.equalsIgnoreCase("yes"))
                {
                System.out.println();
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("Thank you");
                    System.out.println("bye");
                    break;
                }
            }
        }
    }
}