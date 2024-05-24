import java.util.Stack;
public class simplify_path {
    public String simplifyPath(String path) {
        Stack <String> stack =new Stack<>();
        String [] ch = path.split("/");
        for( String character : ch ) {
            if(character.equals("")  || character.equals("."))
                continue;
            else if (character.equals("..")) { 
                if(!stack.isEmpty())
                    stack.pop();

            }
            else {
                stack.push(character);
            }
        }
        if(stack.isEmpty())
            return "/";
        
        String st ="";
        for(String comp : stack) {
            st = "/" + comp;
        }
        return st;
                
        

        
    }
    public static void main(String[] args) {
        simplify_path sp = new simplify_path();

        // Test case
        String path = "/.../a/../b/c/../d/./";
        System.out.println("Input: " + path);
        System.out.println("Output: " + sp.simplifyPath(path));
    }

    
}
