import java.util.Scanner;

public class nyobaInvers {
    static void invers2() {
        Scanner sc = new Scanner(System.in);
        int jmlordo;
        
        System.out.print("masukkan ordo matriks: ");
        jmlordo = sc.nextInt();
        
        double matriks[][] = new double[jmlordo][jmlordo];
        
        for (int i = 0; i < jmlordo; i++) {
            for (int j = 0; j < jmlordo; j++) {
                System.out.print("masukkan element [" + i + "][" + j + "]: " );
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        
        double b = matriks[0][1] * -1;
        double c = matriks[1][0] * -1;
        
        for (int i = 0; i < jmlordo; i++) {
            for (int j = 0; j < jmlordo; j++) {
                System.out.print(matriks[i][j] + "  " );
            } 
            System.out.println();
        }
        System.out.println();
        
        System.out.println("matriks invers");
        double det = (matriks[0][0] * matriks[1][1]) - (matriks[1][0] * matriks[0][1]);
        
        double hasil[][] = new double[jmlordo][jmlordo];

        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                hasil[i][j] = matriks[i][j] * (1 / det);
            }
            
        }

        hasil[1][0] *= -1;
        hasil[0][1] *= -1;

        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(hasil[j][i] + "  " );
            } 
            System.out.println();
        }
        
        // while (i >= 0) {
        //     while (j >= 0) {
        //         if (j == 1) {
        //             System.out.print("[" + matriks[i][j] + "  " + b + "]");
        //             System.out.print("  * 1 / " + det );
        //         }
        //         if (j == 0) {
        //             System.out.print("[" + c + "  " + matriks[i][j] + "]");
        //         }
        //         j--;
        //         i--;
        //         System.out.println();
        //     }
        // }

        // double det2 = (matriks[1][1] * matriks[0][0]) - (b * c);

        // double total = 1 / det * det2;
        // System.out.println();
        // System.out.println("total matriks invers adalah " + total);
    }
    public static void main(String[] args) {
        
        invers2();
    //     Scanner sc = new Scanner(System.in);
    //     int jmlordo;

    //     System.out.print("masukkan jumlah ordo: ");
    //     jmlordo = sc.nextInt();

    //     int matriks[][] = new int[jmlordo][jmlordo];

    //     for (int i = 0; i < jmlordo; i++) {
    //         for (int j = 0; j < jmlordo; j++) {
    //             System.out.print("masukkan elemen [" + i + "][" + j + "]: ");
    //             matriks[i][j] = sc.nextInt();
    //         }
    //     }

    //    for (int i = 0; i < jmlordo; i++) {
    //         for (int j = 0; j < jmlordo; j++) {
    //             System.out.print(matriks[i][j] + "  ");
    //         }  
    //         System.out.println();
    //     }

    //     System.out.println("invers: ");
    //     int det[][] = new int[3][5];

    //     for (int i = 0; i < det[0].length; i++) {
    //         for (int j = 0; j < det.length; j++) {
    //             if (i < 3) {
    //                 det[j][i] = matriks[j][i];                                                                             
    //             }
    //             else {
    //                 det[j][i] = matriks[j][i-3];
    //             }
    //         }
    //     }

    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 5; j++) {
    //             System.out.print(det[i][j] + "  ");
    //         }
    //         System.out.println();
    //     }

    //     int det1[] = new int[3];
    //     int total[] = new int[3];
    //     int hasil = 0;
    //     int apalah = 0;
    //     int j;

    //     for (int i = 0; i < 3; i++) {
    //         j = i;
    //         while (j == i) {
    //             total[i] = det[i][j];
    //             j++;
    //         }
    //     }

    //     for (int i = 0; i < 3; i++) {
    //         hasil *= total[i];
    //     }
    //     System.out.println(hasil);
        
    }
}