package Java_DSA.arrays;

public class max_sum_subarray_prefix_sum {
    public static void main(String args[]){
        int array[]={2,6,5,7,8,9};
        maxSum(array);
    }
    public static void maxSum (int array[]){
    
        int preFixArray[]=new int[array.length];

        int maxSum=Integer.MIN_VALUE;

        preFixArray[0]=array[0];
        for (int i = 1; i < array.length; i++) {
            preFixArray[i] = preFixArray[i-1]+array[i];
        }

        
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                int currSum = i==0 ? preFixArray[j] : preFixArray[j]-preFixArray[i-1];

                System.out.print(currSum+" ");
                if (currSum>maxSum) {
                    maxSum=currSum;
                }
            }
            System.out.println();
        }

        System.out.println("max sum = "+maxSum);

    }
}
