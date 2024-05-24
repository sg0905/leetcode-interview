
// Leetcode question [131 Pallindrome Partitioning]
import java.util.ArrayList;
import java.util.List;
public class palindrome_partitioning {
    public List<List<String>> partition (String s) {
        
        //Intialize a result List
        List<List<String>> result =new ArrayList<>();

        //call backtrack function

        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    public void backtrack( String st, int start, List<String> currentList, List<List<String>> result) {
        if(start == st.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
    
        for(int end =start; end <st.length(); end++ ) { 
            if(isPalindrome(st, start, end)) {
                currentList.add(st.substring(start, end+1));
                backtrack(st, end+1, currentList, result);
                currentList.remove(currentList.size()-1);
            }
        }
    }
    boolean isPalindrome(String s, int start, int end){
        while(start < end) {
            if (s.charAt(start)!= s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    public static void main(String[] args) {
        palindrome_partitioning solution = new palindrome_partitioning();

        // Test Case 1
        String s1 = "aab";
        List<List<String>> result1 = solution.partition(s1);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1);

        // Test Case 2
        String s2 = "a";
        List<List<String>> result2 = solution.partition(s2);
        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2);
    }
}
