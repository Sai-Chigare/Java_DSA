package Java_DSA.patterns;

public class floyds_triangle_pattern {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int size){
        int num = 1;
        for(int i=1 ; i <= size ; i++){
            for(int j=1 ; j <= i ; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
