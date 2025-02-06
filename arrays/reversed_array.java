package Java_DSA.arrays;

public class reversed_array {
    public static void main(String args[]){
        int array[]={1,5,3,6,2,4,8};

        System.out.println("arrray : ");
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();

        reverseArray(array);
        System.out.println("reversed array : ");
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
    public static void reverseArray(int array[]){
        int i=0;
        int j=array.length-1;
        while (i<j) {
            int temp = array[j];
            array[j]=array[i];
            array[i]=temp;
            
            i++;
            j--;
       }
    }
}
