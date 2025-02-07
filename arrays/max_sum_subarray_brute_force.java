package Java_DSA.arrays;

public class max_sum_subarray_brute_force {
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        printMaxSumSubarray(array);
    }
    public static void printMaxSumSubarray(int array[]){
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                  int currSum=0;//current subarray sum
                for (int k = i; k <= j; k++) {
                    currSum += array[k];
                 
                }
                System.out.print(currSum+" ");//print sum of all subarray

                if (maxSum<currSum) {
                    maxSum=currSum;
                }
        
            }
            System.out.println();
        }

        System.out.println("max sum is : "+maxSum);
    }
}
