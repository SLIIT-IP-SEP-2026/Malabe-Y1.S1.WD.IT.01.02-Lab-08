
public class IT26102487Lab8Q2 {

    public static void main(String[] args) {

        // Declare and initialize Array A
        int A[] = {10, 20, 30, 40, 50};

        // Declare and initialize Array B
        int B[] = {34, 67, 12, 89, 12};

        // Declare Array C to store the sum of A and B
        int C[] = new int[5];

        // Calculate A + B and store the results in Array C
        for (int count = 0; count < A.length; count++) {
            C[count] = A[count] + B[count];
        }

        // Display Array A contents
        System.out.println("A Array Contents:");

        for (int count = 0; count < A.length; count++) {
            System.out.print(A[count] + " ");
        }

        // Display Array B contents
        System.out.println("\n\nB Array Contents:");

        for (int count = 0; count < B.length; count++) {
            System.out.print(B[count] + " ");
        }

        // Display Array C contents (A + B)
        System.out.println("\n\nC Array Contents (A + B):");

        for (int count = 0; count < C.length; count++) {
            System.out.print(C[count] + " ");
        }
    }
}
