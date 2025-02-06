package Java_DSA.methods;

public class factorial {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("factorial of "+ num +" = " + fact(num));
    }
    public static int fact(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
