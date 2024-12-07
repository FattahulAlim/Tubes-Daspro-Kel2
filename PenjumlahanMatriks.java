import java.util.Scanner;
public class PenjumlahanMatriks {

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

        if (kolomA != kolomB || barisA != barisB) {
            System.out.println("Mohon input ulang! karena syarat matriks penjumlahan harus sama ordonya");
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
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<barisA; i++) {
            for(int j=0; j<kolomA; j++) {
                c[i][j] = a[i][j] + b[i][j];
            } 
        }
        System.out.println("Hasil penjumlahan Matriks a dan matriks b: ");
        for (int i =0; i<barisA; i++) {
            for(int j=0; j<kolomA; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }   
    }
}
