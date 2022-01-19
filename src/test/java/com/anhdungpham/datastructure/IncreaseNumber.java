package com.anhdungpham.datastructure;

import org.junit.jupiter.api.Test;

public class IncreaseNumber {

    int check(int n) {
        int res = 0;
        while (n >= 1) {
            int temp = n % 10;
            n = n / 10;
            if (temp >= n % 10) {
                res = 1;
            } else {
                res = -1;
                break;
            }
        }
        return res;

    }

    // 123433 4>3 break; => false immediately
    @Test
    void test() {
        int[] n = {123, 321, 23456, 123, 123, 23456, 3523, 123, 321,
                8988, 7654, 9899, 3456, 123, 999, 3456,
                987654321, 4546, 63543, 4656, 13432, 4563,
                123471, 659837, 454945, 34355, 9087, 9977,
                98534, 3456, 23134};
        int count = 0;
        int cnt[] = new int[1000000000];

        for (int j = 0; j < n.length; j++) {
            if (check(n[j]) == 1) {
                cnt[n[j]]++;
            }
        }

        for (int j = 0; j < n.length; j++) {
            if (cnt[n[j]] != 0) {
                System.out.println(String.format("%d-%d", n[j], cnt[n[j]]));
            }
            cnt[n[j]] = 0;
        }
    }
}
