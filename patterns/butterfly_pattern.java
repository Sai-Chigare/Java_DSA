package Java_DSA.patterns;

public class butterfly_pattern {
    public static void main(String args[]){
            method1(10);
            //method2(10);
    }

    public static void method1(int size){

        //upperhalf
        for(int i = 1; i<= size; i++){
            //left stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=(size-i)*2;j++){
                System.out.print("  ");
            }
            //right stars
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();

        }

        //lowerHalf
        for(int i=1;i<=size;i++){
            //leftStars
            for(int j=1;j<=size-i+1;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=(i-1)*2;j++){
                System.out.print("  ");
            }
            //rightStars
            for(int j=1;j<=size-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    public static void method2(int size){


        for(int i=1 ; i <= size ; i++){
            for(int j=1 ; j <=size ; j++){
                if (j<=i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=1 ; j <=size ; j++){
                if (i+j>=size+1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=size;i++){
            for(int j=1; j<=size ; j++){
                if (i+j>=size+1) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int j=1; j<=size ; j++){
                if (j<=i) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
