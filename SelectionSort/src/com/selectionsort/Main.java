package com.selectionsort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20, 35, -15, 7, 1, -22, 9, 55};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i=1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        for(int i=0; i < intArray.length-1; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] intArray, int i, int j) {
        if(i==j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
