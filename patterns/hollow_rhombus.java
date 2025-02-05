package Java_DSA.patterns;

public class hollow_rhombus {

    public static void main(String args[]){

        pattern(10);

    }

    public static void pattern(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=size;j++){
                if (i==1||j==1||i==size||j==size) {
                    System.out.print("* " );
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
    
}
