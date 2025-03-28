import java.util.Scanner;

public class MahasiswaDemo23 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int jumlah = sc.nextInt();
        // sc.nextLine();
        int jumMhs = 5;

        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("--------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        sc.nextLine();

        System.out.println("Pencarian menggunakan Sequential Searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
