import java.util.ArrayList;
import java.util.Scanner;

public class odd_even_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        int[]number=new int[10];
        Scanner read = new Scanner (System.in);

        System.out.print("Enter number :" );

        for(int i=0;i<number.length;i++){
            number[i]=read.nextInt(); 
            if(number[i]%2==0)
            {
                even.add(number[i]);  
                System.out.println("Even number is " + even);
            }
            else{
                odd.add(number[i]);
                System.out.println("Odd number is " + odd);
            }
        }   
    }
}