package Java_DSA.patterns;

public class number_pyramid {
    public static void main(String args[]){
        pattern(5);
    }
    public static void pattern(int size){
        for(int i =1 ; i<=size ; i++){
            //spaces
            for(int j=1;j+i<=size;j++){
                System.out.print(" ");                    
            }
            //row number with extra spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
