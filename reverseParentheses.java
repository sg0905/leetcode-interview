public class reverseParentheses {
    public String reverse(String s){
        char ch [] = s.toCharArray();
        int start, end;
        while(true) {
            end = -1;
            for(int i = 0 ; i < ch.length ; i++) {
              if(ch[i] == ')') {
                end = i;
                break;
              }
            }
            if(end == -1) {
                break;  
              
            }
            start = -1;
            for(int i = end-1 ; i >=0; i--){
                if(ch[i] == '(') {
                    start = i;
                    break;
                }
            }
            reversed(ch , start+1 ,end-1);
            ch[start]=' ';
            ch[end] = ' ';

        }
        return new String(ch).replaceAll(" ","");
    }




    public static void reversed(char ch[], int start, int end){
        
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        String s = "(u(love)i)";
        reverseParentheses rp = new reverseParentheses();
        System.out.println(rp.reverse(s));
        }
}






// public class ReverseParentheses {
    
//     public String reverse(String s) {
//         char[] ch = s.toCharArray();
//         int start, end;
        
//         // Repeat until all parentheses pairs are processed
//         while (true) {
//             // Find the innermost ')'
//             end = -1;
//             for (int i = 0; i < ch.length; i++) {
//                 if (ch[i] == ')') {
//                     end = i;
//                     break;
//                 }
//             }
//             if (end == -1) {
//                 break; // No more ')' found
//             }
            
//             // Find the corresponding '(' for the innermost ')'
//             start = -1;
//             for (int i = end - 1; i >= 0; i--) {
//                 if (ch[i] == '(') {
//                     start = i;
//                     break;
//                 }
//             }
            
//             // Reverse the substring between start and end
//             reverseSubstring(ch, start + 1, end - 1);
            
//             // Remove '(' and ')' from the array
//             ch[start] = ' ';
//             ch[end] = ' ';
//         }
        
//         // Remove spaces from the char array and return as a string
//         return new String(ch).replaceAll(" ", "");
//     }
    
//     private void reverseSubstring(char[] ch, int start, int end) {
//         while (start < end) {
//             char temp = ch[start];
//             ch[start] = ch[end];
//             ch[end] = temp;
//             start++;
//             end--;
//         }
//     }
    
//     public static void main(String[] args) {
//         String s = "(u(love)i)";
//         ReverseParentheses rp = new ReverseParentheses();
//         System.out.println(rp.reverse(s)); // Expected output: "iloveu"
//     }
// }
