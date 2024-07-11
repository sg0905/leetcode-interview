import java.util.ArrayList;
import java.util.Stack;

public class minOperation {
    public int minOperations(String[] logs) {
      ArrayList <String> stack = new ArrayList<>();
      int point = -1;
      for(int i = 0 ; i < logs.length; i++){
        if(logs[i] == "../" ){
            if(stack.isEmpty()) return 0;
            stack.remove(point);
        }
        else if (logs[i]=="./"){
            continue;
        }
        else {
            stack.add(logs[i]);
            point += 1;
        }
        

      }
      return stack.size();
    }
    public static void main(String args[]){
        // String st [] = {"d1/","../","../","../"};
        String st [] = {"d1/","d2/","../","d21/","./"};
        minOperation mn = new minOperation();
        System.out.println(mn.minOperations(st));
    }
}
    

