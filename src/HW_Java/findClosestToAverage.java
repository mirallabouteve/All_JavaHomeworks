package HW_Java;

import java.util.Random;

public class findClosestToAverage {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min = 1;
        int max = 100;
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;

        int closestValue = arr[0];
        int closestIndex = 0;
        int diff = Math.abs(arr[0] - (int) avg);

        for (int i = 1; i < arr.length; i++) {
            int currentDiff = Math.abs(arr[i] - (int) avg);
            if (currentDiff < diff) {
                closestValue = arr[i];
                closestIndex = i;
                diff = currentDiff;
            }
        }

        System.out.println("Найден элемент " + closestValue + " с индексом " + closestIndex);
    }
}

