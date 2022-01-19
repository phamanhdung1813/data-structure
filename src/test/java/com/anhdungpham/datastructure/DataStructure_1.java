package com.anhdungpham.datastructure;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class DataStructure_1 {
    @Test
    void preventKeyBoadType() {
        String text = "leet code ss";
        String brokenLetters = "lt";
        String[] words = text.split(" ");
        int count = words.length;

        if (brokenLetters.length() == 0) {
            System.out.println(count);
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (brokenLetters.contains(words[i].charAt(j) + "")) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    @Test
    void similarPrefix() {
        String[] strs = {"fllower", "fllight", "fllat"};
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) System.out.println("");
            }
        }
        System.out.println(prefix);
    }

    @Test
    void merging2Array() {
        int[] nums1 = {1};
        int[] nums2 = {0};
        int m = 1;
        int n = 0;

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    @Test
    void squared() {
        int[] a = {-4, -1, 0, 3, 10};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
    }

    @Test
    void name() {
        String text = "leet lode ss";
        String brokenLetters = "lt";
        String[] words = text.split(" ");
        int count = words.length;

        for (int i = 0; i < words.length; i++) { //word []
            for (int j = 0; j < words[i].length(); j++) {  // word[i]
                if (brokenLetters.contains(words[i].charAt(j) + "")) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    @Test
    void ThreeNumberSum() {
        int[] nums = {-2, 0, 1, 1, 2};
        Arrays.sort(nums);
        Set<List<Integer>> resSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[j]);
                    newList.add(nums[k]);
                    resSet.add(newList);
                }
                if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        List<List<Integer>> resList = new ArrayList<>();
        for (List<Integer> i : resSet) {
            resList.add(i);
        }
        System.out.println(resList);
    }

    @Test
    void withoutRepeatingCharacter() {
        String s = "abbc"; // if abbcc max 2, last is c
        int i = 0;
        int j = 0;
        HashSet<Character> character = new HashSet<>();
        int max = 0;
        while (i < s.length()) {
            if (!character.contains(s.charAt(i))) {
                character.add(s.charAt(i));
                i++;
                max = Math.max(character.size(), max);
            } else {
                character.remove(s.charAt(j));
                j++;
            }
        }
        character.stream().forEach(System.out::println);
        System.out.println(max);
    }

    @Test
    void removeDuplicate() {
        int[] nums = {1, 2, 2, 3, 5, 5};

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
            }
            if (count == 1) System.out.print(nums[i] + " ");
        }
    }

    @Test
    void removeDuplicate2() {
        int[] nums = {1, 2, 2, 3, 5, 5};
        int[] cnt = new int[nums.length];

        for (int i = 0; i < cnt.length; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] == 1) {
                System.out.println(nums[i]);
            }
        }
    }

    @Test
    void MaxFirstSecond() {
        int[] a = {12, 2, 2, 12, 12};
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

    @Test
    void secondMaxis1() {
        int[] a = {12, 22, 12, 12, 12};
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

    @Test
    void beautifulNumber() {
        int n = 132;
        int x1 = 0, x2 = 0;
        while (n > 0) {
            int x = n % 10;
            if (x == 1) {
                x1 = x;
            }
            if (x == 9) {
                x2 = x;
            }
            n /= 10;
        }
        if (x1 == 1 && x2 == 9) {
            System.out.println("yes");
        } else System.out.println("no");
    }

    @Test
    void PosAndNa() {
        int[] a = {-1, 2, 3, -1, 5, 8, 9};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] * a[i + 1] < 0 || a[i] * a[i - 1] < 0) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }

    @Test
    void palindromeArray() {
        int[] n = {1, 2, 3, 4, 3, 2, 1};
        String mess = "no";
        if (n.length % 2 == 0) {
            mess = "no";
        } else {
            for (int i = 0; i < n.length / 2; i++) {
                if (n[i] != n[n.length - 1 - i]) {
                    mess = "no";
                    break;
                } else {
                    mess = "yes";
                }
            }
        }
        System.out.println(mess);
    }

    @Test
    void increaseArray() {
        int[] n = {1, 2, 3, 5};
        String mess = "";
        int max = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
                mess = "yes";
            } else {
                mess = "no";
                break;
            }
        }
        System.out.println(mess);
    }

    @Test
    void biggerNumberThanBeforeNumber() {
        int[] n = {1, 2, 9, 2, 0, 22};
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
                list.add(n[i]);
            }
        }
        System.out.println(list);
    }

    @Test
    void maxMultiply() {
        int[] n = {2, 9, 8, 9, 6};
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] * n[j] > max) {
                    max = n[i] * n[j];
                }
            }
        }
        System.out.println(max);
    }
}




