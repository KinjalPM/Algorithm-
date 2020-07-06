package io.kinjal.mergesort;

public class Main {

    public static void main(String[] args) {
	int[] intArray = {20,35,-15,7,55,1,-22};

	mergeSort(intArray,0,intArray.length);

	for (int i=0; i<intArray.length; i++){
	    System.out.println(intArray[i]);
    }
    }
    // 20,35,-15,7,55,1,-22
    public static void mergeSort(int[] input, int start, int end){
        if(end-start < 2){
            return;
        }
        int mid =(start+end)/2;
        //left array --> it will return sorted array till mid
        mergeSort(input,start,mid);
        //right array --> it will return sorted array from mid till end
        mergeSort(input,mid,end);
        // then we combine both of the array
        merge(input,start,mid,end);
    }


    // 20,35,-15,7,55,1,-22
    public static void merge(int [] input, int start, int mid, int end){
        if(input[mid-1] <= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempindex =0;
        int[] temp =new int[end-start];
        while(i<mid && j<end){
            temp[tempindex++] = input[i]<= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input,i,input,start+tempindex,mid-i);
        System.arraycopy(temp,0,input,start,tempindex);

    }
}
