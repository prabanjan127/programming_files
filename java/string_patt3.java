import java.util.*;
class string_patt3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {  
        System.out.printf("*");  
        for(int j = 0; j < n; j++) {  
            if((j == n-1 ) || (i == n /2)) {  
                System.out.printf("*");  
            }else {  
                System.out.printf(" ");  
            }  
        }  
        System.out.printf("\n");  
    }  
   
    }
}                            