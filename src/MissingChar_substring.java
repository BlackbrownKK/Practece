public class MissingChar_substring {

    public static void main(String[] args) {
        String str = "Hello";
        int n = 3;
        int a = 13;
        int b = 20;
        int c = 15;
//        missingChar(str, n);
//        backAround(str);
//        startHi(str);
//        hasTeen(a, b, c);
//        mixStart(str);
        stringE(str);
        charAt(str);
        System.out.println(stringE(str));
        System.out.println(charAt(str));
    }

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'e') count ++;
        }
        return (count >= 1 && count <= 3);
    }

    public static char charAt(String str) {
        char result = str.charAt(2);
        return result;
    }

    // Start this substring at n+1 to omit the char. Начните эту подстроку с n+1, чтобы опустить символ.
    // Также можно сократить до str.substring(n+1)
    // which goes through the end of the string. который проходит через конец строки.
    public static String missingChar(String str, int n) {
        // Метод substring() возвращает подстроку заданной строки. Это встроенный метод класса string,
        // который может быть вызван строкой, он возвращает подстроку на основе значений индекса,
        // переданных этому методу. Например: «Beginnersbook». подстрока(9) вернет «book» в качестве подстроки.
        // Этот метод имеет два варианта: в одном вы просто указываете начальный индекс,
        // а в другом варианте вы можете указать как начальный, так и конечный индексы.
        String front = str.substring(n);
//        String back = str.substring(n + 1);
        return front;
    }

    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
//        String back = str.substring(n + 1);
        return last + str + last;
    }

    public static boolean startHi(String str) {

        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int a, int b, int c) {
        if (a < 19 && a > 13) {
            return true;
        } else if (b < 19 && b > 13) {
            return true;
        } else if (c < 19 && c > 13) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String three = str.substring(1, 3);
        if (three.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
}



