package minggu5;

public class MainLatihanNilaiMhs {
    public static void main(String[] args) {

        LatihanNilaiMhs[] mhs = {
            new LatihanNilaiMhs("Ahmad", 220101001, 2022, 78, 82),
            new LatihanNilaiMhs("Budi", 220101002, 2022, 85, 88),
            new LatihanNilaiMhs("Cindy", 220101003, 2021, 90, 87),
            new LatihanNilaiMhs("Dian", 220101004, 2021, 76, 79),
            new LatihanNilaiMhs("Eko", 220101005, 2023, 92, 95),
            new LatihanNilaiMhs("Fajar", 220101006, 2020, 88, 85),
            new LatihanNilaiMhs("Gina", 220101007, 2023, 80, 83),
            new LatihanNilaiMhs("Hadi", 220101008, 2020, 82, 84)
        };

        System.out.println("UTS Tertinggi: " + 
            LatihanNilaiMhs.maxUTS(mhs, 0, mhs.length - 1));

        System.out.println("UTS Terendah: " + 
            LatihanNilaiMhs.minUTS(mhs, 0, mhs.length - 1));

        System.out.println("Rata-rata UAS: " + 
            LatihanNilaiMhs.rataUAS(mhs));
    }
}
