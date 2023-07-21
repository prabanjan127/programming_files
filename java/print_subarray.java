import java.util.*;
class print_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int age[] = new int[n];
        for(int i=0;i<n;i++){
            age[i] = sc.nextInt();}
      System.out.println("Using for-each Loop:");
      for(int a : age) {
        System.out.println(a);
      }
    }
   }