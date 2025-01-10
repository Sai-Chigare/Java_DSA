package Java_DSA.patterns;

public class inverted_half_pyramid_with_numbers {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int size){
        for(int i=1 ; i <= size ; i++){
            for(int j=1 ; j <= size-i+1 ; j++){
                System.out.print(j+" ");
            }
           System.out.println();
        }
    }
}
