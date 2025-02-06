package Java_DSA.arrays;

public class largest_num_Array {
    public static void main(String args[]){

        int array[] = {45,85,65,23,21,51};

        System.out.println("largest number in array : "+arrayLargest(array));

    }
    public static int arrayLargest(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if (largest<array[i]) {
                largest=array[i];
            }
        }
        return largest;
    }
}
