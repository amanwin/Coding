import java.io.*;
import java.util.*;

public class PrintSubarray{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int e = 0; e < n; e++) {
       arr[e] = sc.nextInt();
   }
   for(int start = 0; start < arr.length; start++) {
       for(int end = start; end < arr.length; end++) {
           for(int j = start; j <=end; j++) {
               System.out.print(arr[j] +"\t");
           }
           System.out.println();
       }
   }
 }
}
