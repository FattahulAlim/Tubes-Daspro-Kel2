import java.util.Scanner;

public class matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pemilihan, barisA, kolomA, barisB, kolomB;
        boolean kondisi = true;
        System.out.print("Silahkan masukkan baris matriks pertama: ");
        barisA = sc.nextInt();
        System.out.print("Silahkan masukkan kolom matriks pertama: ");
        kolomA = sc.nextInt();
        System.out.print("Silahkan masukkan baris matriks kedua: ");
        barisB = sc.nextInt();
        System.out.print("Silahkan masukkan kolom matriks kedua: ");
        kolomB = sc.nextInt();

        double[][] matriksA = new double[barisA][kolomA];
        double[][] matriksB = new double[barisB][kolomB];

        while (kondisi) {
            System.out.println("===== Operasi Matriks ====");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Pengurangan Matriks");
            System.out.println("3. Perkalian Matriks");
            System.out.println("4. Invers Matriks ordo 2x2");
            System.out.println("5. Invers Matriks ordo 3x3");
            System.out.println("6. Transpose Matriks");
            System.out.println("7. Keluar");
            System.out.print("Silahkan pilih menu berdasarkan angka: ");
            int operasi = sc.nextInt();

            switch (operasi) {
                case 1:
                    if (kolomA == kolomB && barisA == barisB) {
                        penjumlahan(barisA, kolomA, matriksA, matriksB);
                        break;
                    } else {
                        System.out.println(
                                "Mohon jalankan ulang program untuk melakukan input ulang! karena syarat matriks penjumlahan harus sama ordonya");
                        return;
                    }
                case 2:
                    if (kolomA == kolomB && barisA == barisB) {
                        pengurangan(barisA, kolomA, matriksA, matriksB);
                        break;
                    } else {
                        System.out.println(
                                "Mohon jalankan ulang program untuk melakukan input ulang! karena syarat matriks pengurangan harus sama ordonya");
                        return;
                    }
                case 3:
                    if (kolomA == barisB) {
                        perkalian(barisA, kolomA, barisB, kolomB, matriksA, matriksB);
                        break;
                    } else {
                        System.out.println(
                                "Mohon jalankan ulang program untuk melakukan input ulang! karena syarat matriks perkalian harus sama antara kolom matriks pertama dan baris matriks kedua");
                        return;
                    }
                case 4:
                    if (barisA == 2 && kolomA == 2 && barisB == 2 && kolomB == 2) {
                        System.out.print("Matriks pertama atau kedua yang ingin anda invers? (1 / 2) : ");
                        pemilihan = sc.nextInt();
                        if (pemilihan == 1) {
                            invers2(barisA, kolomA, matriksA);
                            break;
                        } else if (pemilihan == 2) {
                            invers2(barisB, kolomB, matriksB);
                            break;
                        } else {
                            System.out.println(
                                    "Mohon jalankan ulang program untuk melakukan input ulang! input hanya 1 atau 2");
                            return;
                        }
                    } else {
                        System.out.println(
                                "Mohon jalankan ulang program untuk melakukan input ulang! karena program didesain hanya untuk melakukan invers matriks ordo 2 x 2");
                        return;
                    }
                case 5:
                    if (barisA == 3 && kolomA == 3 && barisB == 3 && kolomB == 3) {
                        System.out.print("Matriks pertama atau kedua yang ingin anda invers? (1 / 2) : ");
                        pemilihan = sc.nextInt();
                        if (pemilihan == 1) {
                            invers3(barisA, kolomA, matriksA);
                            break;
                        } else if (pemilihan == 2) {
                            invers3(barisB, kolomB, matriksB);
                            break;
                        } else {
                            System.out.println(
                                    "Mohon jalankan ulang program untuk melakukan input ulang! input hanya 1 atau 2");
                            return;
                        }
                    } else {
                        System.out.println(
                                "Mohon jalankan ulang program untuk melakukan input ulang! karena program didesain hanya untuk melakukan invers matriks ordo 3 x 3");
                        return;
                    }
                case 6:
                    System.out.print("Matriks pertama atau kedua yang ingin anda invers? (1 / 2) : ");
                    pemilihan = sc.nextInt();
                    if (pemilihan == 1) {
                        transpose(barisA, kolomA, matriksA);
                        break;
                    } else if (pemilihan == 2) {
                        transpose(barisB, kolomB, matriksB);
                        break;
                    } else {
                        System.out.println(
                                "Mohon jalankan ulang program untuk melakukan input ulang! input hanya 1 atau 2");
                        return;
                    }
                case 7:
                    System.out.println("Terimakasih!");
                    kondisi = false;
                    break;
                default:
                    break;
            }
        }

    }

    static void penjumlahan(int barisA, int kolomA, double a[][], double b[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Penjumlahan Matriks ======");
        double[][] c = new double[barisA][kolomA];

        System.out.println("Matriks a: ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("nilai matriks a (" + (i + 1) + "," + (j + 1) + ")= ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks b: ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("nilai matriks b (" + (i + 1) + "," + (j + 1) + ")= ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Hasil penjumlahan Matriks a dan matriks b: ");
        for (int i = 0; i < barisA; i++) {
            System.out.print("|");
            for (int j = 0; j < kolomA; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("=================================");
    }

    static void pengurangan(int barisA, int kolomA, double a[][], double b[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Pengurangan Matriks ======");

        double[][] c = new double[barisA][kolomA];

        System.out.println("Matriks a: ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("nilai matriks a (" + (i + 1) + "," + (j + 1) + ")= ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks b: ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("nilai matriks b (" + (i + 1) + "," + (j + 1) + ")= ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Hasil pengurangan Matriks a dan matriks b: ");
        for (int i = 0; i < barisA; i++) {
            System.out.print("|");
            for (int j = 0; j < kolomA; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("=================================");
    }

    static void perkalian(int barisA, int kolomA, int barisB, int kolomB, double a[][], double b[][]) {
        Scanner sc = new Scanner(System.in);

        double[][] c = new double[barisA][kolomB];

        System.out.println("Matriks a: ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("nilai matriks a (" + (i + 1) + "," + (j + 1) + ")= ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks b: ");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("nilai matriks b (" + (i + 1) + "," + (j + 1) + ")= ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                c[i][j] = 0;
                for (int k = 0; k < barisB; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Hasil perkalian Matriks a dan matriks b: ");
        for (int i = 0; i < barisA; i++) {
            System.out.print("|");
            for (int j = 0; j < kolomB; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("===============================");
    }

    static void invers2(int baris, int kolom, double matriks[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Invers matriks ======");
        double hasil[][] = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("masukkan element [" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + "  ");
            }
            System.out.println("|");
            System.out.println();
        }
        System.out.println();

        System.out.println("matriks invers: ");
        double determinan = (matriks[0][0] * matriks[1][1]) - (matriks[1][0] * matriks[0][1]);
        if (determinan == 0) {
            System.out.println("Matriks tidak memiliki invers");
            return;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriks[i][j] * (1 / determinan);
            }
        }

        hasil[1][0] *= -1;
        hasil[0][1] *= -1;

        for (int i = 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 1; j >= 0; j--) {
                System.out.print(hasil[j][i] + "  ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("============================");
    }

    static void invers3(int baris, int kolom, double matriks[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Invers matriks ======");

        double determinan;
        double hasil[][] = new double[3][3];
        double adjoint[][] = new double[3][3];
        double adjointTranspose[][] = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan elemen" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]" + ":");
                matriks[i][j] = sc.nextDouble();
            }
        }
        determinan = matriks[0][0] * (matriks[1][1] * matriks[2][2] - matriks[1][2] * matriks[2][1]) -
                matriks[0][1] * (matriks[1][0] * matriks[2][2] - matriks[1][2] * matriks[2][0]) +
                matriks[0][2] * (matriks[1][0] * matriks[2][1] - matriks[1][1] * matriks[2][0]);
        if (determinan == 0) {
            System.out.println("Matriks tidak memiliki invers");
            return;
        }

        adjoint[0][0] = (matriks[1][1] * matriks[2][2]) - (matriks[1][2] * matriks[2][1]);
        adjoint[0][1] = -1 * ((matriks[1][0] * matriks[2][2]) - (matriks[1][2] * matriks[2][0]));
        adjoint[0][2] = (matriks[1][0] * matriks[2][1]) - (matriks[1][1] * matriks[2][0]);
        adjoint[1][0] = -1 * ((matriks[0][1] * matriks[2][2]) - (matriks[0][2] * matriks[2][1]));
        adjoint[1][1] = (matriks[0][0] * matriks[2][2]) - (matriks[0][2] * matriks[2][0]);
        adjoint[1][2] = -1 * ((matriks[0][0] * matriks[2][1]) - (matriks[0][1] * matriks[2][0]));
        adjoint[2][0] = (matriks[0][1] * matriks[1][2]) - (matriks[0][2] * matriks[1][1]);
        adjoint[2][1] = -1 * ((matriks[0][0] * matriks[1][2]) - (matriks[0][2] * matriks[1][0]));
        adjoint[2][2] = (matriks[0][0] * matriks[1][1]) - (matriks[0][1] * matriks[1][0]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjointTranspose[j][i] = adjoint[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = (1 / determinan) * adjointTranspose[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("============================");
    }

    static void transpose(int baris, int kolom, double matriks[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Transpose Matriks ======");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("input baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks yang telah anda input");
        for (int i = 0; i < baris; i++) {
            System.out.print("|");
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.println("Hasil transpose");
        for (int i = 0; i < kolom; i++) {
            System.out.print("|");
            for (int j = 0; j < baris; j++) {
                System.out.print(matriks[j][i] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("===============================");
    }
}
