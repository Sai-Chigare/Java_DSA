package Java_DSA.methods;

public class primes_in_range {
    public static void main(String args[]){
         primeInRange(10, 100);
    }

    //check prime numbers for the range
    public static void primeInRange(int start , int end){
        for(int i = start;i<=end;i++){
            if (checkPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    //check number is prime or not
    public static boolean checkPrime(int num){
        if (num==2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
