import java.util.Scanner;
public class matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("===== Operasi Matriks ====");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Pengurangan Matriks");
            System.out.println("3. Invers Matriks ordo 2x2");
            System.out.println("4. Invers Matriks ordo 2x2");
            System.out.println("5. Transpose Matriks");
            System.out.println("6. Keluar");
            System.out.print("Silahkan pilih menu berdasarkan angka: ");
            int operasi = sc.nextInt();

            switch (operasi) {
                case 1:
                    penjumlahan();
                    break;
                case 2 :
                    pengurangan();
                    break;
                case 3 : 
                    invers2();
                    break;
                case 4: 
                    invers3();
                    break;
                case 5: 
                    transpose();
                    break;
                case 6:
                    System.out.println("Terimakasih!");
                    kondisi = false;
                    break;
                default:
                    break;
            }
        }

        
    }

    static void penjumlahan() {

    }
    static void pengurangan(){

    }
    static void perkalian(){
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
    static void invers2() {

    }
    static void invers3() {
        Scanner sc = new Scanner(System.in);

        double matriks [][] = new double[3][3];
        double determinan;
        double hasil [][] = new double[3][3];
        double adjoint[][] = new double[3][3];
        double adjointTranspose[][] = new double[3][3];

        for (int i =0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                System.out.print("Masukkan elemen" + "[" + (i+1) + "]" + "[" + (j+1) + "]" + ":"  );
                matriks[i][j] = sc.nextDouble();
            }
        }
        determinan = matriks[0][0] * (matriks[1][1] * matriks[2][2] - matriks[1][2] * matriks[2][1]) -
                     matriks[0][1] * (matriks[1][0] * matriks[2][2] - matriks[1][2] * matriks[2][0]) +
                     matriks[0][2] * (matriks[1][0] * matriks[2][1] - matriks[1][1] * matriks[2][0]);
        
        adjoint[0][0] = (matriks[1][1] * matriks[2][2]) - (matriks[1][2] * matriks[2][1]);
        adjoint[0][1] = -1 * ((matriks[1][0] * matriks[2][2]) - (matriks[1][2] * matriks[2][0]));
        adjoint[0][2] = (matriks[1][0] * matriks[2][1]) - (matriks[1][1] * matriks[2][0]);
        adjoint[1][0] = -1 * ((matriks[0][1] * matriks[2][2]) - (matriks[0][2] * matriks[2][1]));
        adjoint[1][1] = (matriks[0][0] * matriks[2][2]) - (matriks[0][2] * matriks[2][0]);
        adjoint[1][2] = -1 * ((matriks[0][0] * matriks[2][1]) - (matriks[0][1] * matriks[2][0]));
        adjoint[2][0] = (matriks[0][1] * matriks[1][2]) - (matriks[0][2] * matriks[1][1]);
        adjoint[2][1] = -1 * ((matriks[0][0] * matriks[1][2]) - (matriks[0][2] * matriks[1][0]));
        adjoint[2][2] = (matriks[0][0] * matriks[1][1]) - (matriks[0][1] * matriks[1][0]);

        for (int i =0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                adjointTranspose[j][i] = adjoint[i][j];
            }
        }
        for (int i =0; i<3; i++) {
            System.out.print("|");
            for(int j = 0; j<3; j++) {
                hasil [i][j] = (1/determinan) * adjointTranspose[i][j];
                System.out.print(hasil[i][j] + " ");
            } System.out.print("|");
            System.out.println();
        }
    }
    static void transpose() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input baris: ");
        int baris = sc.nextInt();
        System.out.print("Input kolom: ");
        int kolom = sc.nextInt();
        int matriks[][] = new int[baris][kolom];
        int transpose[][] = new int[kolom][baris];

        for (int i = 0; i<baris; i++) {
            for (int j = 0; j<kolom; j++){
                System.out.print("input baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matriks[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<baris; i++) {
            for (int j = 0; j<kolom; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose");
        for (int i = 0; i<kolom; i++) {
            System.out.println("|");
            for (int j = 0; j<baris; j++){
                System.out.print(transpose[i][j] + "");
            } System.out.print("|");
            System.out.println();
        }
    }
}