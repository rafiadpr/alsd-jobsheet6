
public class Dosen23 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen23(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia       : " + usia + " tahun");
        System.out.println("--------------------------");
    }
}
