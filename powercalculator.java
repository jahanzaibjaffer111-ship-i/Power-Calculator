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
            while(1>0)
            {
                System.out.println("HELLO");
                System.out.println("WELCOME TO POWER CALCULATOR");
                System.out.println("ENTRE AMPERE");
                a=read.nextDouble();
                if(a>0)
                {
                    System.out.println("ENTRE VOLTAGE");
                    v=read.nextDouble();
                    if(v>0)
                    {
                        w=a*v;
                        System.out.println("POWER IS");
                        System.out.println(w+"WATT");
                        System.out.println("THANKS");
                        System.out.println("BYE");
                        System.out.println(".");
                    }
                    if(v<0)
                    {
                        System.out.println("VOLTAGE CANT BE NEGATIVE");
                        System.out.println("TRY AGAIN");
                        System.out.println(".");
                    }
                }
                if(a<0)
                {
                    System.out.println("AMPERE CANT BE NEGATIVE");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
            }
        }
    }
}