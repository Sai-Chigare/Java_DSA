package Java_DSA.sorting;
public class insertion_sort {

    //insertion sort     time complexity = O(n^2)
    public static void main(String args[]){
        int arr[]={1,0,3,0,2,6,4};
        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void insertionSort(int arr[]){
        
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev = i-1;

            //finding correct position to insert
            while (prev>=0 && arr[prev]>curr) { 
                arr[prev+1]=arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1]=curr;

        }

    }
}
