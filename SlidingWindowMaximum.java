import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 23, 98, 45, 78, 90, 37};
        int k = 3; // Window size

        if (k > arr.length) {
            System.out.println("Window size is larger than the array.");
            return;
        }

        int[] result = slidingWindowMaximum(arr, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] slidingWindowMaximum(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[arr.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

                if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }
}
