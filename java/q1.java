 package d23_3;

import java.util.Scanner;

class q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        String b[]={"a","b","c"};
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.println(b[j]);
            }
        }
    }
}
























// import java.util.*;
// class q1 {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String a[]={"1","2","3"};
//         String b[]={"a","b","c"};
//         StringBuilder result= new StringBuilder();
//         for(int i=0; i<b.length; i++)
//         {
//            String r= b[i].repeat(i+1);
//             result.append(b[i]).append(r);
//             if (i != b.length - 1) {
//                 result.append(" ");
//                        }
//         }
//         System.out.println(result);
        
//     }
    
// }
// //-----------------------------------------------------

// // class q1
// // {
// //   public static String repeatCharacters(String[] arr1, String[] arr2) {
// //         StringBuilder result = new StringBuilder();
// //         for (int i = 0; i < arr1.length; i++) {
// //             String repeatedString = arr2[i].repeat(i + 1);
// //             result.append(arr1[i]).append(repeatedString);
// //             if (i != arr1.length - 1) {
// //                 result.append(" ");
// //             }
// //         }
// //         return result.toString();
// //      }public static void main(String[] args)
// // {
// //     String[] arr1 = {"a", "b", "c"};
// // String[] arr2 = {"1", "2", "3"};
// // String output = repeatCharacters(arr1, arr2);
// // System.out.println(output); // Output: "a bb cc
// // }
// // }