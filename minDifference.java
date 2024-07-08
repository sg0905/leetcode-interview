import java.util.Arrays;
import java.util.*;
public class minDifference {
    public int solution(int ar[], int min_ele){
        int diff = Integer.MAX_VALUE;
        int len = ar.length;
        if(len <= 4 ) return 0;
        Arrays.sort(ar);
       
        
        for(int i = 0; i <= 3 ; i++ ){
            int j = 3 - i;
            int last = ar[len - 1 - j];
            // System.out.println( i + " Iteration "+ "last  " + last);
            int first = ar[i];
            // System.out.println("Iteration "+ i + "first "+ first);
            diff = Math.min(diff, last-  first);
        }
            
        return diff;
    }
    public static void main(String args[]){
        int ar[] = {0,1,1,4,6,6,6};
        Arrays.sort(ar);
        int min = ar[0];
        minDifference mn = new minDifference();
        System.out.println(mn.solution(ar, min));

    }
}
