package com.agent_rediska;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary {

    public static void main(String[] args) {
        Integer[] array = {2, 4234, 4, 21, 53, 64, 52, 1, 65, 3, 11};
        List<Integer> nameList = Arrays.asList(array);
        Collections.sort(nameList);
//        for (Integer s : nameList) {
//            System.out.println(s);
//        }
        binarySearch(nameList, 1);
    }

    public static void binarySearch(List<Integer> list, Integer item) {
        int low = 0;
        int high = list.size();
        int count = 0;

        while (low <= high) {
            count++;
            int mid = (low + high) / 2;
            Integer test = list.get(mid);
            if (test.equals(item)) {
                break;
            } else if (test < item) {
                low = mid + 1;
            } else high = mid - 1;
            printList(low, high, list);
        }
        System.out.println("количество попыток - " + count);
    }

    public static void printList(int start, int end, List<Integer> list) {
        for(int i = start; i <= end; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }


}
