package Java_DSA.methods;

public class palindrome {
    public static void main(String[] args) {
        isPalindrome(15251);
    }

    public static void isPalindrome(int num){
        int orgNum=num; //original number
        int revNum =0; //reversed number

        while(num>0){
            revNum = revNum*10 + num%10;
            num /= 10;
        }
        if (orgNum == revNum) {
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
