package Java_DSA.arrays;

//have to try once again after covering hashmap and arraylist
public class unique_num_pair {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        sumIsZero(arr, 0);
    }

    public static void sumIsZero(int arr[],int target){
        int solution[][]=new int[10][3];
        int l=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==0) {
                        solution[l][0]=arr[i];
                        solution[l][1]=arr[j];
                        solution[l][2]=arr[k];

                        l++;

                    }
                }
            }
        }

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.print(solution[i][j]+" ");
            }
            System.out.print("  ");
        }
    }
}
