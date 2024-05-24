import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class beautiful_subset {
    int solve(int nums[], int k){
        Arrays.sort(nums);
        int len = nums.length;
        int result = 0; // Initialize the count of beautiful subsets
        
        // Generate all possible subsets
        for(int mask = 1; mask < (1 << len); mask++){ 
            List<Integer> set = new ArrayList<>();
            boolean beautiful = true;
            // Construct subset based on bitmask
            for(int j = 0; j < len; j++){
                if((mask & (1 << j)) != 0) {
                    set.add(nums[j]);
                }
            }
            // Check if the subset is beautiful
            for(int i = 0; i < set.size(); i++) {
                for(int j = i + 1; j < set.size(); j++) {
                    if(Math.abs(set.get(i) - set.get(j)) == k) {
                        beautiful = false;
                        break;
                    }
                }
                if(!beautiful) {
                    break;
                }
            }
            // If the subset is beautiful, increment the count
            if(beautiful) {
                result++;
            }
        }
        return result;
    }
    
    public static void main(String args[]){
        int ar[] = {4, 2, 5, 9, 10, 3};
        int k = 1;
        beautiful_subset b = new beautiful_subset();
        int c = b.solve(ar, k);
        System.out.println(c); // Output should be 23 for the provided input
    }
}

