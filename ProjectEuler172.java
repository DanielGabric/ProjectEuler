public class ProjectEuler172 extends Library {
    static long n = 0;
    //Save 17! to avoid calculating it every time
    public static final long SEVENTEEN = f(17);
    public static void main(String[] args) {
        //Loop through every amount of digits 0-9 to
        //a maximum of 3 digits
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
        //if the amount of digits is not 18 then just go back and try again
        //until it is
        if (sum != 18)return;
        long m;
        //If there are no 0's in this number then there are 18 choices for the first digit
        if (a[0] == 0)m = 18;
        //If there are 0's in the number then the number of choices for the first digit
        //since 0 cannot be a first digit is 18 choice minus the numbers of 0's
        else m = 18 - a[0];
        //multiply the number of digits allowed for first digit by 17!
        m = m * SEVENTEEN;
        //Example
        //If there is more than one digit per number than divide by
        //The number of digits! since there is no order in the
        //same digits
        for (int i = 0; i < 10; ++i)m /= f(a[i]);
        //add the amount of solutions with this configuration of
        //numbers to the total
        n += m;
    }
}
