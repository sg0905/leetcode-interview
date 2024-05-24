import java.util.*;

public class ThreeSum{
    public List<List<Integer>>  run(int ar[]){
        Arrays.sort(ar);
        List<List<Integer>> result =new ArrayList<>();
        int len =ar.length;
        for(int i= 0 ;i < len-2; i++ ) {
            if(i>0 && ar[i]== ar[i-1]) continue;
            int left = i+1;
            int right = len-1;
                
            while(left<right) 
            {

                
                int sum = ar[i]+ar[left]+ar[right];
                if(sum == 0){
                    result.add(Arrays.asList(ar[i],ar[left],ar[right]));
                    while(left < right && ar[left] == ar[left+1])
                        left++;
                    while( left < right && ar[right]==ar[right-1])
                        right--;
                    left++;
                    right--;    
                } else if(sum <0) {
                    left ++;
                }
                else {
                    right --;
                }
                
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int ar[] ={ -1, 0, 1, 2, -1, -4};
        ThreeSum ts= new ThreeSum();
        System.out.println(ts.run(ar));
    }
}
