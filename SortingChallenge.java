import java.util.Arrays;

public class SortingChallenge {

    // =========================================================
    // OPTION 1 — BUBBLE SORT
    // Partner: _________________
    // Big-O: ___________________
    // =========================================================
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // TODO: outer loop — how many passes maximum?
        for (int i = 0; i < ________; i++) {
            boolean swapped = false;

            // TODO: inner loop — compare adjacent pairs
            // Hint: after each pass, the last i elements are already sorted
            for (int j = 0; j < ________; j++) {

                // TODO: if out of order, swap and set swapped = true

            }
            if (!swapped)
                break; // early exit — already sorted!
        }
    }

    // =========================================================
    // OPTION 2 — INSERTION SORT
    // Partner: _________________
    // Big-O: ___________________
    // =========================================================
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Outer loop: start at index 1 (index 0 is already sorted)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // the value we are inserting
            int j = i - 1;

            // TODO: shift elements larger than key one position right
            while (j >= 0 && ________________) {
                arr[j + 1] = arr[j];
                j--;
            }

            // TODO: place key in correct spot
        }
    }

    // =========================================================
    // OPTION 3 — SELECTION SORT
    // Partner: _________________
    // Big-O: always ___________________ (even if already sorted!)
    // =========================================================
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop: i is the boundary — arr[0..i-1] is already sorted
        for (__________________) {
            int minIdx = i; // assume position i holds the current minimum

            // TODO: inner loop — scan unsorted portion arr[i+1 .. n-1]
            for (int j = i + 1; j < ________; j++) {
                // TODO: if arr[j] is smaller than arr[minIdx], update minIdx
            }

            // TODO: swap arr[minIdx] with arr[i] to lock minimum into place
            // Hint: only swap if minIdx != i
        }
    }

    // =========================================================
    // TEST CASES — your methods must produce these results
    // =========================================================
    public static void main(String[] args) {

        // --- Bubble Sort tests ---
        int[] b1 = { 5, 1, 8, 3, 7, 2, 9, 4 };
        bubbleSort(b1);
        System.out.println("Bubble  t1: " + Arrays.toString(b1));
        // Expected: [1, 2, 3, 4, 5, 7, 8, 9]

        int[] b2 = { 1 }; // single element
        int[] b3 = {}; // empty array
        int[] b4 = { 3, 2, 1 }; // reverse sorted
        int[] b5 = { 1, 2, 3, 4, 5 }; // already sorted
        bubbleSort(b2);
        bubbleSort(b3);
        bubbleSort(b4);
        bubbleSort(b5);
        System.out.println("Bubble  t2: " + Arrays.toString(b2)); // [1]
        System.out.println("Bubble  t3: " + Arrays.toString(b3)); // []
        System.out.println("Bubble  t4: " + Arrays.toString(b4)); // [1, 2, 3]
        System.out.println("Bubble  t5: " + Arrays.toString(b5)); // [1, 2, 3, 4, 5]

        System.out.println();

        // --- Insertion Sort tests ---
        int[] i1 = { 5, 1, 8, 3, 7, 2, 9, 4 };
        insertionSort(i1);
        System.out.println("Insert  t1: " + Arrays.toString(i1));
        // Expected: [1, 2, 3, 4, 5, 7, 8, 9]

        int[] i2 = { 1 };
        int[] i3 = {};
        int[] i4 = { 3, 2, 1 };
        int[] i5 = { 1, 2, 3, 4, 5 };
        insertionSort(i2);
        insertionSort(i3);
        insertionSort(i4);
        insertionSort(i5);
        System.out.println("Insert  t2: " + Arrays.toString(i2)); // [1]
        System.out.println("Insert  t3: " + Arrays.toString(i3)); // []
        System.out.println("Insert  t4: " + Arrays.toString(i4)); // [1, 2, 3]
        System.out.println("Insert  t5: " + Arrays.toString(i5)); // [1, 2, 3, 4, 5]

        System.out.println();

        // --- Selection Sort tests ---
        int[] s1 = { 5, 1, 8, 3, 7, 2, 9, 4 };
        selectionSort(s1);
        System.out.println("Select  t1: " + Arrays.toString(s1));
        // Expected: [1, 2, 3, 4, 5, 7, 8, 9]

        int[] s2 = { 1 };
        int[] s3 = {};
        int[] s4 = { 3, 2, 1 };
        int[] s5 = { 1, 2, 3, 4, 5 };
        selectionSort(s2);
        selectionSort(s3);
        selectionSort(s4);
        selectionSort(s5);
        System.out.println("Select  t2: " + Arrays.toString(s2)); // [1]
        System.out.println("Select  t3: " + Arrays.toString(s3)); // []
        System.out.println("Select  t4: " + Arrays.toString(s4)); // [1, 2, 3]
        System.out.println("Select  t5: " + Arrays.toString(s5)); // [1, 2, 3, 4, 5]
    }
}