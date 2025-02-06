package Java_DSA.methods;

public class prime_or_not {
    public static void main(String args[]){
        int num = 15;

        System.out.println("number is prime = "+checkPrime(num));
    }
    public static boolean checkPrime(int num){

        for(int i=2;i<Math.sqrt(num);i++){
            if (num==2) {
                return true;
            }
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
