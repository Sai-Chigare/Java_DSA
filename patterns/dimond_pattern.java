package Java_DSA.patterns;

public class dimond_pattern {
    public static void main(String[] args) {
        pattern(10);
    }

    public static void pattern(int size){
        for(int i=1;i<=size;i++){

            for(int j=1;j<=size-i+1;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=size;i>=1;i--){
            for(int j=1;i+j<=size+1;j++){
                System.out.print("  ");
            }
            for(int j =1; j<=i*2-1;j++){
               System.out.print("* ");
            }
            System.out.println();
        }

    }

}
