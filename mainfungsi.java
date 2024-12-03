import java.util.Scanner;

public class mainfungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operasi;
        boolean kondisi = true;

        while(true) {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah data KRS");
            System.out.println("2. Tampilkan daftar KRS mahasiswa");
            System.out.println("3. Analisis data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            operasi = sc.nextInt();

            switch (operasi) {
                case 1 :
                    inputan();
                    i++;
                    break;
                case 2 :
                    outputan();
                    break;
                case 3 :
                    data();
                    break;
                case 4 :
                    System.out.println("Terima Kasih!");
                    kondisi = false;
                default:
                    break;
            }
        }
    }
}