package minggu5;

public class Faktorial {
    int n;

    public Faktorial(int n) {
        this.n = n;
    }

    // Brute Force : perulangan
    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    // Divide Conquer : rekursi
    int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}