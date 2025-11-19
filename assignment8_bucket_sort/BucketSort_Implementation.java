import java.util.ArrayList;
import java.util.Collections;

public class BucketSort_Implementation {

    public static void bucketSort(int[] arr) {
        System.out.print("Original array: ");
        printArray(arr);
        
        int maxValue = findMaxValue(arr);
        int numberOfBuckets = arr.length;
        
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        System.out.println();
        System.out.println("Step 2: Create empty buckets.");
        
        System.out.println();
        System.out.println("Step 3: Distribute the elements from the array into buckets based on their value.");
        for (int num : arr) {
            int bucketIndex = (num * numberOfBuckets) / (maxValue + 1);
            buckets[bucketIndex].add(num);
            System.out.println("Placed element " + num + " in bucket - [" + bucketIndex + "]");
        }
        
        System.out.println();
        
        System.out.println("Buckets after being distributed:");
        printBuckets(buckets);
        
        System.out.println();
        System.out.println("Step 4: Sort individual buckets.");
        for (int i = 0; i < numberOfBuckets; i++) {
            Collections.sort(buckets[i]);
            System.out.println("Bucket[" + i + "] after sorting: " + buckets[i]);
        }

        System.out.println();
        System.out.println("Step 5: list all sorted buckets elements.");
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
        
        System.out.println();
        System.out.print("Final sorted array: ");
        printArray(arr);
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printBuckets(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("Bucket[" + i + "]: " + buckets[i]);
        }
    }

}
