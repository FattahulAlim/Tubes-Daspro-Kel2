import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;

public class mainfungsi {
    static String DataMhs[][] = new String[300][4];
    static int sks[] = new int[300];
    static int i = 0;
    static int krsMhs = 0;
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
                    Outputan();
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

    static void inputan() {
        Scanner sc = new Scanner(System.in);

        String keputusan;
        int j = 0;
        int total = 0;
        int sksSementara;

        System.out.println("--- Tambah data KRS ---");
        System.out.print("Nama Mahasiswa: ");
        DataMhs[i][j] = sc.nextLine();
        j++;

        System.out.print("NIM: ");
        DataMhs[i][j] = sc.nextLine();
        while (true) {
            j = 2;

            System.out.print("Kode Mata Kuliah: ");
            DataMhs[i][j] = sc.nextLine();
            j++;

            System.out.print("Nama Mata Kuliah: ");
            DataMhs[i][j] = sc.nextLine();

            System.out.print("Jumlah SKS(1-3): ");
            sksSementara = sc.nextInt();
            sc.nextLine();
            if (sksSementara >= 1 && sksSementara < 4) {
                sks[i] = sksSementara;
                total += sks[i];
            } else if (total > 24) {
                System.out.println("Mohon input ulang (total sks tidak boleh lebih dari 24)");
                return;
            } else {
                System.out.println("Mohon input ulang. (SKS tidak boleh melebihi 3)");
                DataMhs[i][j] = null;
                DataMhs[i][j-1] = null;
                DataMhs[i][j-2] = null;
                DataMhs[i][j-3] = null;
                return;
            }
            System.out.println("Data berhasil ditambah!");
            System.out.print("Tambah mata kuliah lain? (y/t): ");
            keputusan = sc.nextLine();

            j = 0;
            if (keputusan.equalsIgnoreCase("t")) {
                break;
            } else {
                i++;
                DataMhs[i][j] = DataMhs[i-1][0];
                j = 1;
                DataMhs[i][j] = DataMhs[i-1][1];
            }
        } if (total <= 20) {
            krsMhs++;
        } System.out.println("Total sks yang diambil: " + total);
    }

    static void Outputan() {
        Scanner sc = new Scanner(System.in);

        String NIM;
        int total = 0;

        System.out.println();
        System.out.println("--- Tampilkan daftar KRS Mahasiswa ---");
        System.out.println("Tampilkan daftar nilai Mahasiswa");
        System.out.print("Masukkan NIM Mahasiswa: ");
        NIM = sc.nextLine();

        System.out.println("Daftar KRS: ");
        System.out.println("NIM\tNama\tKode MK\t\tNama Mata Kuliah\tSKS");

        for (int a = 0; a < DataMhs.length; a++) {
            for (int j = 0; j < DataMhs[0].length; j++) {
                if (NIM.equalsIgnoreCase(DataMhs[a][j])) {
                    System.out.println(DataMhs[a][j] + "\t" + DataMhs[a][j-1] + "\t" + DataMhs[a][j+1] + "\t\t" + DataMhs[a][j+2] + "\t\t\t" + sks[a]);
                    total+=sks[a];
                }
            }
        } System.out.println("Total SKS: " + total);
    }

    static void data() {
        System.out.println();
        System.out.println("--- Analisis data KRS ---");
        System.out.println("jumlah mahasiswa yang mengambil kurang dari 20: " + krsMhs);
    }
}