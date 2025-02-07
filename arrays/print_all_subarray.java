package Java_DSA.arrays;

public class print_all_subarray {
    public static void main(String []args){
        int array[]={2,4,6,8,10};
        printSubarray(array);

    }
    public static void printSubarray(int array[]){
        
        int sumArrayLength = ((array.length-1)*array.length)/2;
        int sumArray[] = new int[sumArrayLength];//array having sum of subarray
        int index=0;//sumarray index

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                   for(int k=i;k<=j;k++){
                    sumArray[index] += array[k];//adding element in sumarray
                    System.out.print(array[k]+",");
                   }                   
                   System.out.print(" sum = "+sumArray[index]+"   ");
                   index++;

            }
            System.out.println();
        }
    }
}