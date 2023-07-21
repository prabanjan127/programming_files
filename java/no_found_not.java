import java.util.Scanner;
class no_found_not {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        {
         int n = obj.nextInt();
         int arr[] = new int[n];
         int flag = 0;
        for (int i = 0; i < n;i++) {
        arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        for(int i = 0; i < n;i++){
        if(k == arr[i]){
        flag = 1;
        break;
        }   
     }
     if(flag ==1)
     {
        System.out.println("found");
     }
     if(flag ==0)
    {
        System.out.println("not found");

    }
    }}}
