public class IT26102406Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        printArray("A Array Contents:", A);
        printArray("\nB Array Contents:", B);
        printArray("\nC Array Contents (A + B):", C);
    }

    static void printArray(String title, int[] arr) {
        System.out.println(title);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}