import java.util.Scanner;

public class invers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double matriks[][] = new double[2][2];
        double hasil[][] = new double[2][2];
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("masukkan element [" + i + "][" + j + "]: " );
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + "  " );
            } 
            System.out.println();
        }
        System.out.println();

        System.out.println("matriks invers: ");
        double determinan = (matriks[0][0] * matriks[1][1]) - (matriks[1][0] * matriks[0][1]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriks[i][j] * (1 / determinan);
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
    }
}
