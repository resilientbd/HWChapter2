import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a line:");
        String inputString = sc.nextLine();
        if(inputString.length()==0)
        {
            System.out.println("invalid input");
        }
        else {
            System.out.println(""+inputString.length());
            System.out.println(""+inputString.charAt(0));
            System.out.println(""+inputString.charAt(inputString.length()-1));
        }

    }
}
