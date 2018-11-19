package com.athidi21athy.inspireTech;

import java.util.*;

public class ArrayManipulator {

    public void getStats(int[] randomArray) {
        System.out.println("initial Array" + Arrays.toString(randomArray));
        System.out.println("Mean " + calculateMean(randomArray));
        System.out.println("Median " + calculateMedian(randomArray));
        System.out.println("Mode " + calculateMode(randomArray));
    }

   public int[] createRandomArray() {
        int [] array = new Random().ints(10,-1,5).toArray();
        return array;
    }
    public double calculateMedian(int[] array) {
        double median = 0.0;
        Arrays.sort(array);
        System.out.println("Sorted Array " + Arrays.toString(array));
        if (array.length % 2 !=0) {
          median =  array[array.length/2];
        } else
            median = (array[array.length/2] + array[array.length/2-1])/2.0;
        return  median;
    }
    public double calculateMode(int[] array) {
        int maxNumber = -1;
        int maxAppreance = -1;
        for (int i = 0; i <array.length; i++) {
            int counter = 0;
            for(int j = 0; j <array.length; j++) {
                if (array[i] == array[j])
                    counter++;
            }
            if (counter > maxAppreance) {
                maxNumber = array[i];
                maxAppreance = counter;
            }
        }
        return maxNumber;
    }

    public double calculateMean(int[] array) {
        double mean = array.length / 2;
        return mean;
    }
}
