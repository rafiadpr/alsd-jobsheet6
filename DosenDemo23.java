
import java.util.Scanner;

public class DosenDemo23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen23 listDosen = new DataDosen23();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (listDosen.idx < 10) {
                        System.out.print("Masukkan Kode Dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan Nama Dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Jenis Kelamin (L untuk Laki-laki, P untuk Perempuan): ");
                        char jk = sc.next().charAt(0);
                        System.out.print("Masukkan Usia: ");
                        int usia = sc.nextInt();
                        boolean jenisKelamin = (jk == 'L' || jk == 'l');

                        Dosen23 dsn = new Dosen23(kode, nama, jenisKelamin, usia);
                        listDosen.tambahDosen(dsn);
                    } else {
                        System.out.println("Data dosen sudah penuh!");
                    }
                    break;
                case 2:
                    listDosen.tampilInformasi();
                    break;
                case 3:
                    listDosen.sortingAscending();
                    listDosen.tampilInformasi();
                    break;
                case 4:
                    listDosen.sortingDescending();
                    listDosen.tampilInformasi();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
