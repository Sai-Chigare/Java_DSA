package Java_DSA.methods;

public class bionomial_coefficient {
    public static void main(String args[]){
        int n =5;
        int r =2;
        System.out.println("n = "+n+" r = "+r+" bionomial coefficient = "+bionomial(n, r));
    }

    public static int bionomial(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
}
