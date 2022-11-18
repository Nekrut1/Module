package nekrutenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayService {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    protected int[] createArray() {
        int[] array = new int[arrayLength()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
        }
        return array;
    }

    private int arrayLength() {
        System.out.print("Write array length, 10 or bigger: ");
        int index = scanner.nextInt();
        if (index >= 10) {
            System.out.println("Your random array is: ");
        } else {
            System.out.println("Number must be more tnan 10");
            scanner.nextInt();
        }
        return index;
    }

    protected void sort(int[] array) {
        System.out.println("Ascending array, press 1" + "\n" + "Descending array, press 2");
        int index = scanner.nextInt();
        if (index == 1) {
            arrayAscend(array);
        } else if (index == 2) {
            arrayDescend(array);
        } else {
            System.out.println("Number must be 1 or 2");
            scanner.nextInt();
        }
    }

    private void arrayAscend(int[] array) {
        boolean flag = false;
        int temp;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
        }
    }

    private void arrayDescend(int[] array) {
        boolean flag = false;
        int temp;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
        }
    }

    protected void arrayInCube(int[] array) {
        for (int i = 2; i < array.length; i += 3) {
            array[i] = array[i] * array[i] * array[i];
        }
        System.out.println("\n" + "Every third array element in the cube" + "\n");
    }

    protected void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}



