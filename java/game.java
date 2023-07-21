import java.util.*;

class game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int size = scan.nextInt();
            int leap = scan.nextInt();
            int curr = 0;
            int game[] = new int[size];
            for (int i = 0; i < size; i++)
                game[i] = scan.nextInt();
            while (curr + 1 < size && game[curr + 1] != 1)
                curr++;
            while (curr + leap < size && game[curr + leap] != 1)
                curr += leap;
            if(curr + leap > size-1)curr += leap;
            if(curr == size-1 && game[curr] == 0)curr++;
            System.out.println((curr >= size) ? "Yes" : "No");
scan.close(); 
        }
        }
        
    }
