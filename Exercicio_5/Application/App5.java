package Exercicio_5.Application;
import java.util.Scanner;
//ajustar segunda parte
public class App5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] mat = new int[3][3];

        System.out.println("Digite uma matriz 3x3:");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("A matriz digitada foi:");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }

        int[][] mat2 = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat2 = new int[i][j];
            }
        }

        mat2[0] = mat[6];
        mat2[1] = mat[3];
        mat2[2] = mat[0];
        mat2[3] = mat[7];
        mat2[4] = mat[4];
        mat2[5] = mat[1];
        mat2[6] = mat[8];
        mat2[7] = mat[5];
        mat2[8] = mat[2];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        
        in.close();
    }
}
