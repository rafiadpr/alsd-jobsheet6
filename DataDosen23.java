
public class DataDosen23 {

    Dosen23[] dataDosen = new Dosen23[10];
    int idx = 0;

    void tambahDosen(Dosen23 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampilInformasi() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingAscending() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen23 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDescending() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen23 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen23 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    void PencarianDataSequential23(String nama) {
        boolean ketemu = false;
        int jumlahHasil = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                ketemu = true;
                jumlahHasil++;
                
            }
        }
        if (!ketemu) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu dosen dengan nama " + nama);
        }
    }

    int PencarianDataBinary23(double usia, int left, int right) {
        sortingAscending();
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (usia == dataDosen[mid].usia) {
                System.out.println("Dosen dengan usia " + usia + " ditemukan:");
                dataDosen[mid].tampil();
                return mid;
            } else if (dataDosen[mid].usia > usia) {
                return PencarianDataBinary23(usia, left, mid - 1);
            } else {
                return PencarianDataBinary23(usia, mid + 1, right);
            }
        }
        System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        return -1;
    }
}
