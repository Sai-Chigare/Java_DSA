package Java_DSA.arrays;

public class linear_search {

    public static void main(String args[]){

        int array[] = {11,5,26,35,2,63,85};
        int key =26;
        
        int index = arrayLinearSearrch(key, array);

        if (index==-1) {
            System.out.println("key is not present");
        }
        else{
            System.out.println(key+" is present in index : "+index);
        }

    }

    public static int arrayLinearSearrch(int key,int array[]){
        for(int i=0;i<array.length;i++){
            if (array[i]==key) {
                return i;
            }
        }
        return -1;
    }
    
}