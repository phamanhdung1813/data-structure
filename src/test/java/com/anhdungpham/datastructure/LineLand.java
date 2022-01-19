package com.anhdungpham.datastructure;

import org.junit.jupiter.api.Test;

public class LineLand {
    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    @Test
    void lineLand() {
        int[] n = {-5, -2, 2, 7};
        for (int i = 0; i < n.length; i++) {
            if (i == 0) {
                System.out.println(String.format("%d %d", n[i + 1] - n[i],
                        n[n.length - 1] - n[i]));
            } else if (i == n.length - 1) {
                System.out.println(String.format("%d %d", n[i] - n[i - 1],
                        n[i] - n[0]));
            } else {
                System.out.println(String.format("%d %d",
                        min(n[i] - n[i-1], n[i + 1] - n[i]),
                        max(n[i] - n[0], n[n.length - 1] - n[i])
                ));
            }
        }
    }
}
