import java.util.Scanner;
public class PerkalianMatriks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kolomA,barisA,kolomB,barisB;

        System.out.print("Masukkan baris matriks a: ");
        barisA = sc.nextInt();
        System.out.print("Masukan kolom matriks a: ");
        kolomA = sc.nextInt();

        System.out.print("Masukkan baris matriks b: ");
        barisB = sc.nextInt();
        System.out.print("Masukan kolom matriks b: ");
        kolomB = sc.nextInt();

        if (kolomA != barisB) {
            System.out.println("Mohon input ulang");
            return;
        }

        int [][] a = new int [barisA][kolomA];
        int [][] b = new int [barisB][kolomB];
        int [][] c = new int [barisA][kolomB];

        System.out.println("Matriks a: ");
        for(int i = 0; i < barisA; i++) {
            for(int j = 0; j < kolomA; j++ ) {
                System.out.print("nilai matriks a ("+(i+1)+","+(j+1)+")= ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks b: ");
        for(int i = 0; i < barisB; i++) {
            for(int j = 0; j < kolomB; j++ ) {
                System.out.print("nilai matriks b ("+(i+1)+","+(j+1)+")= ");
                b [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<barisA; i++) {
            for(int j=0; j<kolomB; j++) {
                c[i][j] = 0;
                for(int k=0; k<barisB; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            } 
        }
        System.out.println("Hasil perkalian Matriks a dan matriks b: ");
        for (int i =0; i<barisA; i++) {
            for(int j=0; j<kolomB; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }   
    }
}
