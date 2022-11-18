package nekrutenko;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayLock {

    private final int[] lockedArray;

    protected ArrayLock(int[] lockedArray) {
        this.lockedArray = Arrays.copyOf(lockedArray,lockedArray.length);
    }

    protected int[] getLockedArray() {
        return Arrays.copyOf(lockedArray,lockedArray.length);
    }

    protected void printArray(){
        System.out.println("Locked array: " + Arrays.toString(lockedArray));
    }
}
