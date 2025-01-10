package Java_DSA.patterns;

public class right_half_pyramid {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int size){
        for(int i = 0 ; i <= size ; i++){
            for(int j = 0 ; j <= size ; j++){
                if (j>= size-i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
