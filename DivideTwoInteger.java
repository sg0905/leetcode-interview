public class DivideTwoInteger {
    public int divide(int dividend, int divisor){
        if(dividend== Integer.MIN_VALUE && divisor== -1){
            return Integer.MAX_VALUE;
        }
        return dividend/ divisor;
    }
    public static void main(String args[]){
        DivideTwoInteger di= new DivideTwoInteger();
        System.out.println(di.divide(Integer.MIN_VALUE,-1));
    }
    
}
