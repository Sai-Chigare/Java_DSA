package Java_DSA.methods;

public class binary_to_decimal {
    public static void main(String[] args) {
        int binary = 111;
        System.out.println("binary number "+binary+" is in decimal = "+binaryToDecimal(binary));
    }
    public static int binaryToDecimal(int binary){
        int deciaml = 0;
        int num;
        for(int i=0;binary>0;i++){
            num = binary%10;
            binary /= 10;
            deciaml += num*Math.pow(2, i);
        }
        return deciaml;
    }
}
