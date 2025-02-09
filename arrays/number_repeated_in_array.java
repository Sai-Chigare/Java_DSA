package Java_DSA.arrays;

import java.util.HashSet;

public class number_repeated_in_array {

    public static void main(String args[]){
        int array[]={1,2,3,1};
        System.out.println("is number reapeated (regular approach) : "+isNumberRepeated_RegularApproach(array));
        System.out.println("is number reapeated (hashset approach) : "+isNumberRepeated_HashSetApproach(array));

    }

    //timecomplexity = O(n^2)
    public static boolean isNumberRepeated_RegularApproach(int array[]){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    return true;
                }
                
            }
        }

        return false;
    }

     //time complexity = O(n)
    public static boolean isNumberRepeated_HashSetApproach(int array[]){

        HashSet<Integer> seenIntegers = new HashSet<>();

        for (int num : array) {

            if (seenIntegers.contains(num)) {
                return true;
            }

            seenIntegers.add(num);
            
        }

        return false;

    }


}