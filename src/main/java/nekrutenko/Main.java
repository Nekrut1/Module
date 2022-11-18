package nekrutenko;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.createArray();
        arrayService.printArray(array);
        arrayService.sort(array);
        arrayService.printArray(array);
        arrayService.arrayInCube(array);
        arrayService.printArray(array);

        System.out.println("---------------------------------------------");

        ArrayLock arrayLock = new ArrayLock(array);
        arrayLock.printArray();
        arrayLock.getLockedArray()[0] = 60;
        System.out.println("After change " + "\uD83D\uDE01");
        arrayLock.printArray();

    }
}
