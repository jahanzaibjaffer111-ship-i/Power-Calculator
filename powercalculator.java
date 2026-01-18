import java.util.Scanner;
public class powercalculator
{
    public static void main(String[] args)
    {
        /*v=voltage
        a=ampere
        w=watt */
        double a,v,w;
        try (Scanner read = new Scanner(System.in)) 
        {
            while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to Power Calculator");
                System.out.println("Enter Ampere");
                a=read.nextDouble();
                if(a>=0)
                {
                    System.out.println("Enter Voltage");
                    v=read.nextDouble();
                    if(v>=0)
                    {
                        w=a*v;
                        System.out.println("Power is");
                        System.out.println(w+" Watt");
                        System.out.println("Thanks");
                        System.out.println("Bye");
                        System.out.println(".");
                    }
                    else if(v<0)
                    {
                        System.out.println("Voltage can't be negative");
                        System.out.println("Try again");
                        System.out.println(".");
                    }
                }
                else if(a<0)
                {
                    System.out.println("Ampere can't be negative");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
        }
    }

}


