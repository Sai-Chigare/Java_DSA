package Java_DSA.sorting;

import java.util.Arrays;
import java.util.Collections;

// inbuilt function for sorting          time complexity = O(n^2)
public class inbuilt_sorting_func {
    public static void main(String args[]){
        Integer arr[]={5,7,8,1,6,4};
        //Arrays.sort(arr);       : sorting
        //Arrays.sort(arr,0,3);   : sorting from index 0 to index 3
        //Arrays.sort(arr,Collections.reverseOrder());    : sorting in reverse order
        Arrays.sort(arr,0,3,Collections.reverseOrder());   //  : sorting in reverse oreder from index 0 to 3
        
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

}
