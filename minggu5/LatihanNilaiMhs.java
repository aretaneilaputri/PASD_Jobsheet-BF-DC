package minggu5;

public class LatihanNilaiMhs {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    LatihanNilaiMhs(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // UTS Tertinggi (Divide & Conquer)
    static int maxUTS(LatihanNilaiMhs[] arr, int l, int r) {
        if (l == r) return arr[l].nilaiUTS;

        int mid = (l + r) / 2;
        int left = maxUTS(arr, l, mid);
        int right = maxUTS(arr, mid + 1, r);

        return Math.max(left, right);
    }

    // UTS Terendah (Divide & Conquer)
    static int minUTS(LatihanNilaiMhs[] arr, int l, int r) {
        if (l == r) return arr[l].nilaiUTS;

        int mid = (l + r) / 2;
        int left = minUTS(arr, l, mid);
        int right = minUTS(arr, mid + 1, r);

        return Math.min(left, right);
    }

    // Rata-rata UAS (Brute Force)
    static double rataUAS(LatihanNilaiMhs[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}