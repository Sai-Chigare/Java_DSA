package Java_DSA.patterns;

public class hollow_rectangle_paattern {
    public static void main(String args[]){
        pattern(5);
    }
    public static void pattern(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j =1 ; j <= size; j++){

                if (j == size || j == 1 || i == size || i == 1 ) {
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
