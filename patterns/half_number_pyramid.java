package Java_DSA.patterns;

public class half_number_pyramid {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int size){
        for( int i= 1;i<=size;i++ ){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print( j+" ");
            }
            System.out.println();
        }
    }

}
