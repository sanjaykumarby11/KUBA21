import java.util.Scanner;
public class BreakExample
{
 public static void main(String[] args) 
     {
        Scanner scanner=new Scanner(System.in);

        System.out.print("How many numbers will you enter");
        int count=scanner.nextInt();

        System.out.println("Enter the number");
        for(int i=0;i<count;i++)
        {
            int num=scanner.nextInt();
            if(num%2==0)
            {
                System.out.println("First even number found"+num);
                break;
            }
        }
        scanner.close();
     
    
    }

 }   

