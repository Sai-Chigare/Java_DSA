package Java_DSA.patterns;

public class triangle_0_1 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int size){
        for(int i=1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}