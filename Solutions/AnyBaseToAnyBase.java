import java.util.*;
  
  public class AnyBaseToAnyBase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int baseTen = convertToBaseTen(n,sourceBase);
     int res = 0;
     int power = 1;
     while(baseTen!=0) {
         int r = baseTen % destBase;
         baseTen = baseTen / destBase;
         res += r * power;
         power *= 10;
     }
     System.out.println(res);
   }   
   
   private static int convertToBaseTen(int n, int b) {
       int power = 1;
       int ans = 0;
       while(n!=0) {
           int r = n % 10;
           n = n / 10;
           ans += power * r;
           power *=b;
       }
       return ans;
   }
  }