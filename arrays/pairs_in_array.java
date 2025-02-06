package Java_DSA.arrays;

public class pairs_in_array {
    public static void main(String args[]){
        int array[] ={4,2,5,1,6,3,9};
        printArrayPair(array);
    }

    public static void printArrayPair(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+")");
            }
            System.out.println();
        }
    }

}
