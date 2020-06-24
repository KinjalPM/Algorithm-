package io.kinjal.selectionSort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] Array = {20,35,-15,7,55,1,-22};
       // last index is removed
        for(int LastUnsortedIndex = Array.length -1; LastUnsortedIndex>0; LastUnsortedIndex--){
            int largest = 0;
          // looking for largest element --> find the largest element
            for(int i=1; i<=LastUnsortedIndex; i++){
                if(Array[i]>Array[largest]){
                    largest=i;
                }
            }
            //after finding largest we swap it with last element in the unsorted partition
            swap(Array,largest, LastUnsortedIndex);

        }

        for(int i=0;i<Array.length;i++){
            System.out.println(Array[i]);
        }
    }
    public static void swap(int[] array, int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
