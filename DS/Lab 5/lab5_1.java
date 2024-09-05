import java.util.Scanner;

public class lab5_1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[][] A=new int[2][2];
        int[][] B=new int[2][2];
        int[][] C=new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter the element of A["+i+"]["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter the element of B["+i+"]["+j+"]");
                B[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Final Array");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
               System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}