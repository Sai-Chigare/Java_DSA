package Java_DSA.arrays;


//kadans algorithm takes 0 as a sum for -ve

public class max_sum_subarray_kadans_algo {
    public static void main(String args[]){
        int array[] = {5,6,8,2,-8,-10,5,2,8};
        maxSumOfSubarray(array);
    }
    public static void maxSumOfSubarray(int array[]){
       int maxSum = Integer.MIN_VALUE;

       int currSum= array[0]<0 ? 0 : array[0]; 
       for (int i = 1; i < array.length; i++) {
            if (currSum>maxSum) {
                maxSum=currSum;
            }
            currSum = currSum+array[i]==0? 0 : currSum+array[i];
       }

       System.out.println("max sum is : "+maxSum);

    }
}
