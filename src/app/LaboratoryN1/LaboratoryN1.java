package app.LaboratoryN1;

public class LaboratoryN1 {
    public static void main(String[] args) {
        final int C = 1;
        int a = 2;
        int n = 5;
        int b = 1;
        int m = 4;
        float S = 0;

        if ((a > n) || (b > m)) {
            System.out.println("Starting index should be greater than or equal to the final one!");
            return;
        }
        // if ((a < 0) || (b < 0)) {
        //     System.out.println("Input parameters should be greater than or equal to zero!");
        //     return;
        // }
        if (((a <= C) && (n >= C)) || ((b <= 0) && (m >= 0))) {
            System.out.println("Zero division error detected!");
            return;
        }

        for (float i = a; i <= n; i++) {
            for (float j = b; j <= m; j++) {
                S += (i % j) / (i - C);
            }
        }

        System.out.println("Final result = " + S);
    }
}
