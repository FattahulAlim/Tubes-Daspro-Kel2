import java.util.Scanner;
public class FungsiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operasi;
        boolean kondisi= true;
        while (kondisi) {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah data KRS");
            System.out.println("2. Tampilkan daftar KRS mahasiswa");
            System.out.println("3. Analisis data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            operasi = sc.nextInt();
            if (operasi == 4) {
                kondisi = false;
            }
            switch (operasi) {
                case 1:
                    
                    break;
                case 2 :
                    break;
                case 3 : 
                
                break;
                default:
                    break;
            }
        }
    }
}