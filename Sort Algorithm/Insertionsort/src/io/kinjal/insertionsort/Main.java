package io.kinjal.insertionsort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = {20,35,-15,7,55,1,-22};
        //growing the sorted partition by 1
        for(int firstUnsortedIndex=1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int newElement=intArray[firstUnsortedIndex];
            int i;
            // its looking for the correct position to insert wach element
            for(i = firstUnsortedIndex; i>0 &&intArray[i-1]>newElement; i--){
            intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for(int i=0;i<intArray.length;i++){
        System.out.println(intArray[i]);
        }
    }
}
