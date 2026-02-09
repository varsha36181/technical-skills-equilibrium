import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        int sum=0;
        System.out.println("Enter the elements of matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0,j=0;i<rows && j<cols;i++,j++){
            sum = sum + matrix[i][j];
        }
        System.out.print(sum);
    }
}