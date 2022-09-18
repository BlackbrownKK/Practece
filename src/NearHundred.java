public class NearHundred {

    public static void main(String[] args) {
        int n = 15;
        int a = 13;
        int b = 7;
        diff21(n);
        close10(a, b);
        System.out.println(nearHundred(n));
        System.out.println(diff21(n));
        System.out.println(close10(a, b));
    }

    public static boolean nearHundred(int n) {
        if (n < 100 && n > 90) {
            return true;
        }
        if (n < 200 && n > 190) {
            return true;
        } else {
            return false;
        }
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return n;
        }
    }

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if ((aDiff - 10) < (bDiff - 10)) {
            return a;
        }
        if ((bDiff - 10) < (aDiff - 10)) {
            return b;
        }
        return 0;
    }
}


