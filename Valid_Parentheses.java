//Leetcode question 20 on Valid Parantheses.
import java.util.Stack;
public class Valid_Parentheses {
   public boolean isValid(String s) {
    Stack <Character> stack =new Stack<>();    
    for(char c:s.toCharArray()) {
            if(c == '(' || c == '{' || c =='[') {
                stack.push(c);
            }
            else if(c == ')' || c == '}' || c == ']' ) {
                if(stack.isEmpty() || !ismatching(stack.pop() , c))
                    return false;
            }

        }
        return stack.isEmpty();
   }

   public boolean ismatching(char pop ,  char close) {
    if(pop == '(' && close ==')')
        return true;
    else if(pop == '{' && close =='}')
        return true;
    else if(pop == '[' && close == ']')
        return true;
    else
        return false;
   }
   public static void main(String[] args) {
    Valid_Parentheses vp = new Valid_Parentheses();
    String[] testCases = {"()", "()[]{}", "(]", "([)]", "{[]}"};

    for (String testCase : testCases) {
        System.out.println(testCase + " is valid: " + vp.isValid(testCase));
        }
    }
}
