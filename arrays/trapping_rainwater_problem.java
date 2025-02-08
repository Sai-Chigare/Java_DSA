package Java_DSA.arrays;


//my apporach without reference   time complextity = O(n^2)
public class trapping_rainwater_problem {

    public static void main(String args[]){
        int array[]={4, 2, 0, 3, 2, 5};
      trappedRainwater(array);
    }
    public static void trappedRainwater(int array[]){
        int prevIndex =0;
        int nextMaxIndex =array.length-1;
        int water = 0;

        while (prevIndex<array.length-1) {
            
            //calculating water packet
            for (int i = prevIndex+1; i <=nextMaxIndex; i++) {
                if (array[prevIndex] <= array[i] || (i==array.length-1)) {
                    nextMaxIndex=i;
                    break;
                }
               
            }

            //setting limits
            int limit = Math.min(array[prevIndex], array[nextMaxIndex]);

            //trapped water
            for (int i = prevIndex+1; i < nextMaxIndex; i++) {
                water=water+(limit-array[i]);
            }

            //reset the previous trap for next packet
            prevIndex=nextMaxIndex;
            nextMaxIndex=array.length-1;

        }

        System.out.println("trapped water : "+water);
        

    }
}