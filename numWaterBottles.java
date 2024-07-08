public class numWaterBottles {
    public int run(int numBottles, int numExchange) {
        int count = numBottles;
        // if (numBottles <= 3 ){
        //     return count+1;
        // }
        while(numBottles > 1){
                int rem = numBottles % numExchange;
                int temp = numBottles / numExchange;
                count = count + temp; 
            
            numBottles = (numBottles /numExchange) + 1;
        }
        return count;
    }
     
    public static void main(String args[]){
        int numB = 9;
        int numE = 3;
        numWaterBottles mn = new numWaterBottles();
        System.out.println(mn.run(numB, numE));
    }   
}
