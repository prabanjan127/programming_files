import java.util.*;
class i_j_equal_patt {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1;i<=n;i++,System.out.println()){
     
    for(int j=1;j<=n;j++){
        if(i==j)
        {
            System.out.print(j);
        }
        else
        {
            System.out.print(" ");
        }
    }

    }
    for(int i=n;i>=0;i--,System.out.println()){
     
        for(int j=n;j>=0;j--){
            if(i>=j)
            {
                System.out.print(i);
            }
                                                                                                                             
        }
    
        }
        for(int i=n;i>=0;i--,System.out.println()){
     
            for(int j=n;j>=0;j--){
                if(i>j)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            
            }
        
            }
    
}
}