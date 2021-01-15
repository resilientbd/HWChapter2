import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args)
    {
        System.out.print("Please input a word (length should odd): \t");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();
        if(inputWord.length()==0)
        {
            System.out.println("Invalid Input!");
        }
        else {
            if(inputWord.length()%2==0)//input is even
            {
                System.out.println("invalid input!");
            }
            else {//input is odd
                System.out.println(""+inputWord.charAt(inputWord.length()/2));
            }
        }
    }
}
