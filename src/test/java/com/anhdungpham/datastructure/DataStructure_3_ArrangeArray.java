package com.anhdungpham.datastructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DataStructure_3_ArrangeArray {
    @Test
    void ArrangeArray() {
        int[] n = {14, -88, 6, 23, 88, -14};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (Math.abs(n[i]) > Math.abs(n[j])) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
                if (Math.abs(n[i]) == Math.abs(n[j]) && n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    int sumNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    @Test
    void sumOfNumber() {
        int[] n = {11, 88, 6, 23, 14};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (sumNumber(n[i]) > sumNumber(n[j])) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                } else if (sumNumber(n[i]) == sumNumber(n[j]) && n[i] < n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    @Test
    void EvenAscOddDesc() {
        int[] a = {4, 13, 2, 9, 8, 5, 7, 11};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] % 2 != 0) && (a[j] % 2 == 0)) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j] && a[i] % 2 == 0 & a[j] % 2 == 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if (a[i] < a[j] && a[i] % 2 != 0 & a[j] % 2 != 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}



