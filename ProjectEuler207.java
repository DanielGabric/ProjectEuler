public class ProjectEuler207 {
    public static void main(String[] args) {
        double i = 1, r = 1, q = 1.0 / 12345.0;
        do {
            r = (int) (Math.log(++i + 1) / Math.log(2)) / (i - 1);
        } while (r >= q);
        System.out.println((i) * (i - 1));
    } 
}
