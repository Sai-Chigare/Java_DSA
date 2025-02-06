package Java_DSA.patterns;

public class reversed_number_pattern {

    public static void main(String args[]){
            pattern(5);
    }

    public static void pattern(int size){

        for(int i=1;i<=size;i++){
        int num = 1;

            for(int j=1;j<=size-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(num +" ");
                if (j<i) {
                    num++;
                }else{
                    num--;
                }
                
            }

            System.out.println();
        }
    }
    
}
