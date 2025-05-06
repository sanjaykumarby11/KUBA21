import java.util.Scanner;
public class ForLoopExample
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number for the multiplication table:");
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "x"+i+"="+(num*i));
        }
            scanner.close();
        }
}