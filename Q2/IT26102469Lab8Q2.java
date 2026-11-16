public class IT26102469Lab8Q2 {

    public static void main(String[] args) {

        int A[] = {10, 20, 30, 40, 50};
        int B[] = {34, 67, 12, 89, 12};
        int C[] = new int[5];

        // Calculate A + B and Store in Array C
        for (int count = 0; count < C.length; count++) {

            C[count] = A[count] + B[count];
        }

        // Print A Array Contents
        System.out.println("A Array Contents:");

        for (int count = 0; count < A.length; count++) {

            System.out.print(A[count] + " ");
        }

        // Print B Array Contents
        System.out.println("\n\nB Array Contents:");

        for (int count = 0; count < B.length; count++) {

            System.out.print(B[count] + " ");
        }

        // Print C Array Contents (A + B)
        System.out.println("\n\nC Array Contents (A + B):");

        for (int count = 0; count < C.length; count++) {

            System.out.print(C[count] + " ");
        }

        System.out.println();

    }
}
