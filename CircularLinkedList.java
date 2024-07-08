import java.util.ArrayList;
import java.util.List;

class findTheWinner{
    public static void main(String args[]){
        int n = 6;
        int k = 5;
        findTheWinner fw = new findTheWinner();
        System.out.println(fw.findWinner(n, k));

    }
   
    public int findWinner(int n, int k){
        List<Integer> list = new ArrayList<>(n);
        for(int i = 0 ; i < n; i++){
            list.add(i+1);
        }
        int id = 0;
        while(list.size() != 1){
            int remove_index = (id + k -1 ) % list.size();
            list.remove(remove_index);
            id = remove_index;
        }
        return list.get(0);
        
    }
}