package Java_DSA.patterns;

public class inverted_star_pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= size - i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
