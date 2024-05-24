import java.math.BigInteger;


class MultiplyString {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        String result= c.toString();
        return result;
    }
    public static void main(String args[]){
        MultiplyString ms=new MultiplyString();
        System.out.println(ms.multiply("354874461235416456464", "245646464541464645446468446854"));
        
    }
}