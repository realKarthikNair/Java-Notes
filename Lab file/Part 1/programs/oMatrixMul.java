// Write a Java program  to implement matrix multiplication by 2d array

public class oMatrixMul {
    public static void main(String[] args) {
        // create 2d arrays and multiply them
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int c[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // multiply the matrices
                c[i][j] = 0;
                for(int k=0;k<3;k++){
                    // add the products of the elements of the matrices
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        // print the result
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
