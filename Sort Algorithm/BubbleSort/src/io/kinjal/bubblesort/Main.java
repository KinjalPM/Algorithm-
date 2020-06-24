package io.kinjal.bubblesort;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // out loop where after last element is sorted then remove it
        for (int a =intArray.length - 1; a > 0; a--) {
           // inner loop from index 0 to last index
            for (int b = 0; b < a; b++) {
                // comparing element at index i and i+1 if i>i+1 there is swap
                if (intArray[b] > intArray[b + 1]) {
                    swap(intArray, b, b + 1);
                }
            }
        }
        // PRINTING THE ARRAY
        for(int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    // SWAPPING METHOD
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
