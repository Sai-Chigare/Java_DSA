package Java_DSA.arrays;

// binary search on already sorted array
public class binary_search {
    public static void main(String args[]){
        int array[] = {2,3,5,6,8,9,15,47};
        int key = 47;
        int index = binarySearchOnSortedArray(array, key);

        if (index==-1) {
            System.out.println("key is not present");
        }
        else{
            System.out.println("key present in index : "+index);
        }
    }
    public static int binarySearchOnSortedArray(int array[],int key){

        int minIndex =0;
        int maxIndex = array.length-1;

        while (minIndex <= maxIndex) {
            int midIndex = (minIndex+maxIndex)/2;
            if (array[midIndex]==key) {
                return midIndex;
            }

            if (array[midIndex]<key) {
                minIndex=midIndex+1;
            }
            else{
                maxIndex=midIndex-1;
            }

        }

        return -1;
    }
}
