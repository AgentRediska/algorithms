package com.agent_rediska;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {2, 4234, 4, 21, 53, 64, 52, 1, 65, 3, 11};
        sorted(array);
    }

    public static void sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexSmallest = findSmallestIndex(arr, i);
            int container = arr[i];
            arr[i] = arr[indexSmallest];
            arr[indexSmallest] = container;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static int findSmallestIndex(int[] arr, int startPosition) {
        int smallest = arr[startPosition];
        int smallestIndex = startPosition;
        for (int i = startPosition; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
