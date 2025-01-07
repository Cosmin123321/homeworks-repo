//nu da bine la output
import java.util.Scanner;

public class matrix_print {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix rows: ");
        int mat_rows = sc.nextInt();
        System.out.print("Enter the matrix columns: ");
        int mat_columns = sc.nextInt();

        int[][] mat = new int[mat_rows][mat_columns];

        System.out.println("\nEnter the elements of the matrix ");
        for (int i = 0; i < mat_rows; i++) {
            for (int j = 0; j < mat_columns; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        mat_print(mat);
    }

    public static void mat_print (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ' ');
            }
            System.out.println();
        }
    }
}