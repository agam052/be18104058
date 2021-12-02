import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for matrix1 : ");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        System.out.println("Enter the elements of matrix1 : ");
        int a[][]= new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = scan.nextInt();
            }
        }   
        m1.setMatrix(a);
        
        System.out.println("Enter the number of rows and columns for matrix2 : ");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        System.out.println("Enter the elements of matrix2 : ");
        int b[][]= new int[r2][c2];
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j] = scan.nextInt();
            }
        }   
        m2.setMatrix(b);
    
        try {
            m1.sum(m1, m2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Matrix{
 
    int rows;
    int cols;
    int matrix[][] = new int [rows][cols];
    
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    
    public void setElement(int i, int j,int element) {
        matrix[i][j] = element;
    }
    
    public void setMatrix(int mat[][]) {
        matrix = mat;
    }
    
    public void sum(Matrix m1, Matrix m2) throws Exception {
        if(m1.rows == m2.rows && m1.cols == m2.cols) {
            int matrix1[][]  = m1.matrix;
            int matrix2[][]  = m2.matrix;
            
            int sum[][] = new int[matrix1.length][matrix[0].length];
            
            for(int i=0;i<matrix1.length;i++) {
                for(int j=0;j<matrix1[0].length;j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            
            System.out.println("Addition of matrices: ");
            for(int i=0;i<sum.length;i++) {
                for(int j=0;j<sum[0].length;j++) {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            throw new Exception("Matrices cannot be added");
        }
    }
}