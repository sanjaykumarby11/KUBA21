import java.util.Scanner;
public class DoWhileExample 
{
 public static void main(String[] args)
 {
    Scanner scanner=new Scanner(System.in);
    int num;

    do
    {
        System.out.print("Enter a number (0 to stop):");
        num =scanner.nextInt();
        if(num!=0)
        {
            System.out.println("You entered:"+num);
        }
    }
    while(num!=0);
    System.out.println("Program is terminated");
    scanner.close();
 }   
}
