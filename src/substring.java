public class substring {
    public static void main(String[] args) {
        String str = "Beginnersbook";
        int f=3;
        int b=9;
        System.out.println(missingChar(str, f,b));
    }
    public static String missingChar(String str, int f,int b) {
        String front = str.substring(f,str.length()-5);
        return front;
    }
}
