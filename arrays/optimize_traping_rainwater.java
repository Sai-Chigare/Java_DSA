package Java_DSA.arrays;

//better approach   timecomplexity = O(n)
public class optimize_traping_rainwater {
    public static void main(String args[]){
        int array[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        trappedRainwater(array);
    }

    public static void trappedRainwater(int array[]){
        //left bar limit
        int leftArray[] = new int[array.length];
        leftArray[0]=array[0];
        for (int i = 1; i < array.length; i++) {
            leftArray[i]=Math.max(array[i], leftArray[i-1]);
        }

        //right bar limit
        int rightArray[] = new int[array.length];
        rightArray[array.length-1]=array[array.length-1];
        for(int i = array.length-2;i>=0;i--){
            rightArray[i]=Math.max(array[i], rightArray[i+1]);
        }
        //water
        int water = 0;

        //traped water
        for(int i =0 ; i<array.length;i++){
            int waterLevel = Math.min(rightArray[i], leftArray[i]); // waterlevel = minimum of left and right bars
            water = water + waterLevel-array[i];
        }

        System.out.println("trapped water : "+water);

    }

}
