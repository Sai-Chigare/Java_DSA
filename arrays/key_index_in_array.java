package Java_DSA.arrays;

public class key_index_in_array {
    public static void main(String[] args) {
        int key = 5;
        int array[]={1,2,8,4,5,6};
        System.out.println("index of key : "+getKeyIndex(array, key));
        
    }

    public static int getKeyIndex(int array[],int key){

       for (int i = 0; i < array.length; i++) {
         if (array[i]==key) {
            return i;
         }
       }
       return -1;
    }

}
