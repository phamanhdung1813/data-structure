package com.anhdungpham.datastructure;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    @Test
    void sumMatrix() {

        int[][] a = {{23, 11, 22}, {14, 5, 9}};

        for (int i = 0; i < a[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
            }
            System.out.println(sum);
        }
    }

    boolean prime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    void mostRowPrimeNumber() {
        int[][] a = {{23, 11, 22}, {14, 5, 9}, {2, 3, 4}};

        int res = 0;
        int row = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (prime(a[i][j])) {
                    count++;
                }
            }
            if (count > res) {
                res = count;
                row = i;
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            if (prime(a[row][i])) {
                System.out.println(a[row][i]);
            }
        }
        System.out.println(row + 1);
    }

    @Test
    void mostColPrimeNumber() {
        int[][] a = {{23, 11, 22}, {14, 5, 9}, {14, 5, 9}};
        int col = 0;
        int res = 0;
        for (int i = 0; i < a[0].length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (prime(a[j][i])) {
                    count++;
                }
            }

            if (count > res) {
                res = count;
                col = i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (prime(a[i][col])) {
                System.out.print(a[i][col] + " ");
            }
        }
        System.out.println();
        System.out.println(res);
        System.out.println(col + 1);
    }

    @Test
    void deleteMaxRowMaxCol() {
        int[][] a = {{23, 11, 22}, {14, 62, 9}, {14, 5, 9}};

        int row = 0;
        int col = 0;
        int maxSRow = 0;
        int maxSCol = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
                if (sum > maxSRow) {
                    maxSRow = sum;
                    row = i;
                }
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
                if (sum > maxSCol) {
                    maxSCol = sum;
                    col = i;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i != row) {
                for (int j = 0; j < a[0].length; j++) {
                    if (j != col) {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    @Test
    void deleteMaxRowAndReCalMaxColDel() {
        int[][] a = {{23, 11, 22}, {14, 62, 9}, {14, 5, 9}};
        int row = 0;
        int col = 0;
        int maxSRow = 0;
        int maxSCol = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
                if (sum > maxSRow) {
                    maxSRow = sum;
                    row = i;
                }
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            int sum = 0;
            if (i != row) {
                for (int j = 0; j < a.length - 1; j++) {
                    sum += a[j][i];
                }
                if (sum > maxSCol) {
                    maxSCol = sum;
                    col = i;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i != row) {
                for (int j = 0; j < a[0].length; j++) {
                    if (j != col) {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    @Test
    void ReArrangeRow() {
        int[][] a = {{23, 11, 22}, {14, 62, 9}, {14, 5, 9}, {14, 7, 9}};
        int row1 = 1;
        int row2 = 2;

        for (int i = 0; i < a[0].length; i++) {
            int temp = a[row1][i];
            a[row1][i] = a[row2][i];
            a[row2][i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void ReArrangeCol() {
        int[][] a = {{23, 11, 22}, {14, 62, 9}, {14, 5, 9}};
        int col1 = 1;
        int col2 = 2;

        for (int i = 0; i < a.length; i++) {
            int temp = a[i][col1];
            a[i][col1] = a[i][col2];
            a[i][col2] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void ReArrangeMatrixDiagonal() {
        int n = 3;
        //main diagonal a[i][i]
        //sub diagonal a[i][n-1-i]
        int[][] a = {{23, 11, 22}, {14, 62, 9}, {14, 5, 9}};
        for (int i = 0; i < n; i++) {
            int main = a[i][i];
            a[i][i] = a[i][n - 1 - i];
            a[i][n - 1 - i] = main;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void PrimeInDiagonal() {
        int[][] a = {{23, 11, 29}, {14, 43, 9}, {23, 5, 23}};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (prime(a[i][i])) count++;
            if (prime(a[i][a[i].length - i - 1])) count++;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        if (prime(a[a.length / 2][a.length / 2])) count--;
        System.out.println(count);
    }

    int[] primeNumber = new int[10001];

    void SieveEratosthenesAlgorithms() {
        for (int i = 0; i < 10000; i++)
            primeNumber[i] = 1; // prime number is true
        primeNumber[0] = primeNumber[1] = 0; // not prime number
        for (int i = 2; i < 100; i++) {
            if (primeNumber[i] == 1) {
                for (int j = i * i; j < 10000; j += i) {
                    primeNumber[j] = 0;
                }
            }
        }
    }

    @Test
    void primeNumExceptDuplicate() {
        SieveEratosthenesAlgorithms();
        int[] a = {2, 3, 4, 5, 6, 7, 3};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (primeNumber[a[i]] == 1) {
                count++;
                System.out.println(a[i]);
                primeNumber[a[i]] = 0;
            }
        }
    }

    @Test
    void diagonalExceptDuplicate() {
        SieveEratosthenesAlgorithms();
        int[][] a = {{23, 11, 29}, {14, 43, 9}, {23, 5, 23}};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            if (primeNumber[a[i][i]] == 1) {
                System.out.println(a[i][i]);
                count++;
                primeNumber[a[i][i]] = 0;
            }
            if (primeNumber[a[i][a[0].length - i - 1]] == 1) {
                System.out.println(a[i][a[0].length - i - 1]);
                count++;
                primeNumber[a[i][a[0].length - i - 1]] = 0;
            }
        }
        System.out.println(count);
    }

    @Test
    void transposeMatrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void reverseMatrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[0].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void reverseMatrixAndTranspose() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[0].length - 1; j >= 0; j--) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void matrixDisplay() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = a[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void sum2Matrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] c = new int[a[0].length][a.length];

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] += a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    void multiply2Matrix() {
        int n = 2;
        int m = 3;
        int p = 2; // x q p = m

        int[][] a = {{1, 2, 3}, {4, 5, 6}}; // n x m
        int[][] b = {{1, 4}, {2, 5}, {3, 6}}; // p x q
        int[][] c = new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    // transpose
                    // c[i][j] += a[i][k] * b[j][k];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }


    @Test
    void multiplyMatrixTranspose() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] ta = new int[3][2];
        int[][] c = new int[2][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                ta[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * ta[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

