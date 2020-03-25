package app.LaboratoryN2;

import java.util.Scanner;
import java.util.Random;

public class LaboratoryN2 {

    public static void main(String[] args) {
        final String letters = "1234567890abcdefghijklmnopqrstuvwxyz";
        int arrAB;
        int lenAB;
        char[][] A;
        char[][] B;
        char[][] C;
        int sumC = 0;
        int average;

        Scanner input = new Scanner(System.in);
        Random randomInt = new Random();
        while (true) {
            System.out.println("Enter the number of rows in A and B >");
            arrAB = input.nextInt();
            System.out.println("Enter the number of columns in A and B >");
            lenAB = input.nextInt();
            if ((arrAB < 1) || (lenAB < 1)) {
                System.out.println("Incorrect parameters, please try again!");
            } else {
                input.close();
                A = new char[arrAB][lenAB];
                B = new char[arrAB][lenAB];
                C = new char[arrAB][lenAB];
                break;
            }
        }
        for (int i = 0; i < arrAB; i++) {
            for (int j = 0; j < lenAB; j++) {
                A[i][j] = letters.charAt(randomInt.nextInt(letters.length()));
                B[i][j] = letters.charAt(randomInt.nextInt(letters.length()));
                C[i][j] = (char)(A[i][j] + B[i][j]);
                sumC += (int)C[i][j];
                System.out.format("C[%d][%d] = A[%d][%d] + B[%d][%d] = '%s' + '%s' = '%s' = %d\n",
                    i, j, i, j, i, j, A[i][j], B[i][j], C[i][j], (int)C[i][j]);
            }
        }
        average = sumC / (arrAB * lenAB);
        System.out.format("Average = %d / (%d * %d) = %d = %s\n", sumC, arrAB, lenAB, average, (char) average);
    }
}
