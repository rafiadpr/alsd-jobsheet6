import java.util.Scanner;

public class MahasiswaDemo23 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23(jumlah);

        for (int i = 0; i < jumlah; i++) {
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

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (Ascending): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data mahasiswa yang sudah urut menggunakan Selection Sort (Ascending): ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data mahasiswa yang sudah urut menggunakan Insertion Sort (Ascending): ");
        // list.insertionSort();
        // list.tampil();

        System.out.println("Data mahasiswa yang sudah urut menggunakan Insertion Sort (Descending): ");
        list.insertionSortDescending();
        list.tampil();
    }
}
