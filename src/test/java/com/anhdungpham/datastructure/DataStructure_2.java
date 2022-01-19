package com.anhdungpham.datastructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DataStructure_2 {
    boolean check(int a[]) {
        int m25 = 0;
        int m50 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 25) {
                m25++;
            } else if (a[i] == 50) {
                if (m25 == 0) {
                    return false;
                } else {
                    m25--;
                    m50++;
                }
            } else {
                if (m25 == 0 || (m25 * 25 + m50 * 50 < 75)) {
                    return false;
                }
                if (m50 != 0) {
                    m25--;
                    m50--;
                } else {
                    m25 -= 3;
                }
            }
        }
        return true;
    }

    @Test
    void selectDistinct() {
        int[] n = {1, 2, 3, 3, 3, 3, 1, 9, 9, 0};

        for (int i = 0; i < n.length; i++) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (n[i] == n[j]) {
                    count++;
                    break;
                }
            }
            if (count == 1) System.out.println(n[i]);
        }

    }

    @Test
    void mostAppearNumber() {
        int[] n = {1, 2, 3, 3, 3, 3, 3, 3, 9, 9, 9, 9, 9, 9, 9, 3};
        int count = 0;
        int res = 0;

        int[] countArray = new int[10000]; // memory

        for (int i = 0; i < n.length; i++) {
            countArray[n[i]]++;
        }

        for (int i = 0; i < n.length; i++) {
            if (countArray[n[i]] > count) {
                count = countArray[n[i]];
                res = n[i];
            } else if (countArray[n[i]] == count) {
                if (res > n[i]) {
                    res = n[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(res);
    }

    @Test
    void firstAppearNumber() {
        int[] n = {3, 3, 3, 3, 9, 9, 9, 9, 3};
        int count = 0;
        int res = 0;
        int[] cnt = new int[1000];
        for (int i = 0; i < n.length; i++) {
            cnt[n[i]]++;
            System.out.print(cnt[n[i]] + " ");
        }

        for (int i = 0; i < n.length; i++) {
            if (cnt[n[i]] > count) {
                count++;
                res = n[i];
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(res);
    }

    @Test
    void countArray() {
        int[] n = {1, 2, 3, 3, 3, 3, 9, 9, 9, 9};
        int[] cnt = new int[1000];
        for (int i = 0; i < n.length; i++) {
            cnt[n[i]]++;
        }

        for (int i = 0; i < n.length; i++) {
            if (cnt[n[i]] != 0) {
                System.out.println(String.format("%d %d", n[i], cnt[n[i]]));
                cnt[n[i]] = 0;
            }
        }
    }

    @Test
    void uniqueNumberInArray() {
        int[] n = {1, 2, 3, 3, 3, 3, 9, 9, 9, 9};
        int[] cnt = new int[n.length];

        for (int i = 0; i < n.length; i++) {
            cnt[n[i]]++;
            if (cnt[n[i]] == 1) {
                System.out.println(n[i]);
            }
        }
    }

    @Test
    void SumFromStartToEnd() {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 1;
        int end = 10;
        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += n[i];
        }
        System.out.println(sum);
    }

    @Test
    void kadaneAlgo() {
        int[] n = {-1, 2, 8, -3, 9, -2, 5};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            sum1 += n[i];
            if (sum1 > sum2) {
                sum2 = sum1;
            }
            if (sum1 < 0) {
                sum1 = 0;
            }
        }
        System.out.println(sum2);
    }

    @Test
    void maxArray() {
        int[] n = {1, 2, 15, 8, 1, 4, 5, 3, 9, 15};
        int k = 3;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < n.length - k + 1; i++) {
            int sum2 = 0;
            for (int j = i; j < k + i; j++) {
                sum2 += n[j];
                if (sum2 > sum) {
                    sum = sum2;
                    index = j - 2;
                }
            }
        }
        System.out.println(sum);
        for (int i = 0; i < k; i++) {
            System.out.println(n[index++]);
        }
    }

    @Test
    void maxArray2() {
        int[] n = {1, 2, 4, 8, 1, 15, 5, 3, 9, 4};
        int k = 3;
        int sum = 0;
        int res = sum; // max value
        int index = 0;
        for (int i = 0; i < k; i++) {
            sum += n[i];
        }

        for (int i = 1; i < n.length - k + 1; i++) {
            sum = sum - n[i - 1] + n[i + k - 1];
            if (sum > res) {
                res = sum;
                index = i;
            }
        }
        System.out.println(res);
        for (int i = 0; i < k; i++) {
            System.out.println(n[index + i]);
        }
    }

    @Test
    void firstLoopValue() {
        int[] n = {1, 3, 4, 2, 2, 3, 2, 1};
        int[] cnt = new int[1000];
        int ok = 0;

        for (int i = 0; i < n.length; i++) {
            cnt[n[i]]++;
            if (cnt[n[i]] == 2) {
                System.out.println(n[i]);
                break;
            }
        }
    }

    @Test
    void TwoArrayArrange() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3, 4, 7};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        int count = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[count++] = a[i];
                i++;
            } else {
                c[count++] = b[j];
                j++;
            }
        }
        while (i < a.length) c[count++] = a[i++];
        while (j < b.length) c[count++] = b[j++];
        for (int k = 0; k < c.length; k++) {
            System.out.println(c[k]);
        }
    }

    @Test
    void hopgiao2mang() {
        int[] a = {1, 2, 3, 7};
        int[] b = {2, 3, 4, 8};
        int[] X = new int[10]; //h
        int[] Y = new int[10]; //g
        int countX = 0;
        int countY = 0;
        int j = 0, i = 0;

        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                X[countX++] = b[j++];
            } else if (a[i] == b[j]) {
                X[countX] = a[i];
                Y[countY] = a[i];
                countX++;
                countY++;
                i++;
                j++;
            } else {
                X[countX++] = a[i++];
            }
        }

        while (i < a.length) X[countX++] = a[i++];
        while (j < b.length) X[countX++] = b[j++];

        for (int k = 0; k < X.length; k++) {
            if (X[k] != 0) {
                System.out.print(X[k] + " ");
            }
        }
        System.out.println(" ");

        for (int k = 0; k < Y.length; k++) {
            if (Y[k] != 0) {
                System.out.print(Y[k] + " ");
            }
        }
    }

    @Test
    void oddEvenArrange() {
        int[] n = {9, 8, 1, 2, 3, 6, 5, 4, 7, 10};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[j] < n[i]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        int[] odd = new int[n.length / 2 + 1];
        int[] even = new int[n.length / 2 + 1];
        int oddC = 0;
        int evenC = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                even[evenC++] = n[i];
            } else {
                odd[oddC++] = n[i];
            }
        }
        for (int i = 0; i < n.length / 2; i++) {
            System.out.print(even[i] + " ");
        }
        for (int i = 0; i < n.length / 2; i++) {
            System.out.print(odd[i] + " ");
        }
    }

    @Test
    void moneyCountGreedy() {
        int k = 70;
        int[] n = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] < n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        // greedy algorithms
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
            count += k / n[i];
            k %= n[i];
        }
        System.out.println(count);
    }

    @Test
    void dominanceArray() {
        int[] n = {23, 34, 45, 56, 67, 78, 89, 90, 121, 131, 141, 151, 161, 171};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (n.length % 2 == 0 && evenCount > oddCount) {
            System.out.println("YES");
        } else if (n.length % 2 != 0 && oddCount > evenCount) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }

    @Test
    void pitagore() {
        int[] n = {12, 5, 13};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        if (n[0] * n[0] + n[1] * n[1] == n[2] * n[2]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    @Test
    void BRT() {
        int[] n = {2, 8, 1, 3, 9, 7};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        int count = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n.length; i++) {
            if (n[i] - n[i - 1] < res) {
                res = n[i] - n[i - 1];
                count = 1;
            } else if (n[i] - n[i - 1] == res) {
                count++;
            }
        }
        System.out.println(String.format("Routes %d - Length %d", count, res));
    }
}

