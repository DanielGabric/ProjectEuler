public class ProjectEuler172 extends Library {
    static long n = 0;
    public static final long SEVENTEEN = f(17);
    public static void main(String[] args) {
        for (int a = 0; a < 4; ++a) {
            for (int b = 0; b < 4; ++b) {
                for (int c = 0; c < 4; ++c) {
                    for (int d = 0; d < 4; ++d) {
                        for (int e = 0; e < 4; ++e) {
                            for (int f = 0; f < 4; ++f) {
                                for (int g = 0; g < 4; ++g) {
                                    for (int h = 0; h < 4; ++h) {
                                        for (int i = 0; i < 4; ++i) {
                                            for (int j = 0; j < 4; ++j) {
                                                z(new int[]{a, b, c, d, e, f, g, h, i, j},
                                                a + b + c + d + e + f + g + h + i + j);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(n);
    }

    public static void z(int[] a, int sum) {
        if (sum != 18)return;
        long m;
        if (a[0] == 0)m = 18;
        else m = 18 - a[0];
        m = m * SEVENTEEN;
        for (int i = 0; i < 10; ++i)m /= f(a[i]);
        n += m;
    }
}
