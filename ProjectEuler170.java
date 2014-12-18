/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulersol;

import java.util.*;
import java.math.*;

public class ProjectEuler170 extends Library {
    static int[] f = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    public static void main(String[] args) {
        cat:
        do {

            for (int i = 2; i < f.length - 2; ++i) {
                int first = 0;
                int second = 0;
                for (int j = 0; j < i; ++j) {
                    first *= 10;
                    first += f[j];
                }
                for (int j = i; j < f.length; ++j) {
                    second *= 10;
                    second += f[j];
                }
                out:
                for (int j = 1; j <= 49; ++j) {
                    int n[] = new int[10];
                    if (first % j == 0 && second % j == 0) {
                        int s = j;
                        d(n, s);
                        d(n, first / j);
                        d(n, second / j);
                        for (int k = 0; k < 10; ++k) {
                            if (n[k] != 1) {
                                continue out;
                            }
                        }
                        int res = 0;
                        for (int k = 0; k < 10; ++k) {
                            System.out.print(f[k]);
                        }
                        System.out.println();
                        break cat;
                    }
                }

            }
        } while (nextPermutation(f));
    }

    public static void d(int[] n, int r) {
        while (r > 0) {
            n[r % 10]++;
            r /= 10;
        }
    }
}
