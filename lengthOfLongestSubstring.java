
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.


public class lengthOfLongestSubstring{
    public static void main(String args[]){
        String s = "pwwkew";
        char ch[] = s.toCharArray();
        int temp[] = new int [300];
        // for (char c : ch){
        //     System.out.print(c);
        // }
        // System.out.println();
        int count = 0;
        int inner_count=0;
        for(int i = 0 ; i < ch.length; i++){
            int t = (int)ch[i];
            if(temp[t] ==0){
                temp[t]=1;
                count = count + 1;
            }
            else {
                count  = 1;              
                continue;
            }
        }
        System.out.println(count);
    }
}