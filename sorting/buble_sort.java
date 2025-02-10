package Java_DSA.sorting;

//buble sort       time complexity = O(n^2)
public class buble_sort {
    public static void main(String args[]){
        int arr[] = {1,5,3,6,4,2,8};
        bubleSort(arr);
    }

    public static void bubleSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int swap=0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
            if (swap==0) {
                break;
            }
        }


        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

}
