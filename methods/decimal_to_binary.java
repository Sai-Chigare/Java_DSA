package Java_DSA.methods;

public class decimal_to_binary {
    public static void main(String args[]){
        int deciaml = 5;
        System.out.println("decimal "+deciaml+" = "+"binary "+decimalToBinary(deciaml));

    }
    public static int decimalToBinary(int decimal){
        int binary=0;
        int num;
        for(int i=0;decimal>0;i++){
            num = decimal%2;
            binary += num*Math.pow(10, i);
            decimal /= 2;
        }
        return binary;
    }
}
