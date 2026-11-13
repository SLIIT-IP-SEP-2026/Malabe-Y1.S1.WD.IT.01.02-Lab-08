public class IT26102649Lab8Q2 {
    public static void main(String[] args) {
        // Initialize arrays A and B with given values
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5]; // Result array

        // Add corresponding elements of A and B and store in C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Display Array A
        System.out.println("A Array Contents:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        // Display Array B
        System.out.println("\n\nB Array Contents:");
        for (int num : B) {
            System.out.print(num + " ");
        }

        // Display Array C
        System.out.println("\n\nC Array Contents (A + B):");
        for (int num : C) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}