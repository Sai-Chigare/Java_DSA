package Java_DSA.patterns;

public class left_star_pattern {
    public static void main(String args[]){
       printStartPattern(5);
    }

    public static void printStartPattern(int size){
        for(int i = 1 ; i<=size ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}