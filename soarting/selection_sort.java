package Java_DSA.soarting;

public class selection_sort {

    public static void main(String[] args) {
        int arr[]={5,6,2,4,1,8};
        selectionSort(arr);
    }

    //selection sort     time complexity = O(n^2)
    public static void selectionSort(int arr[]){


        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex =j;
                }
            }
            if (minIndex!=i) {
                int temp = arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    
}
