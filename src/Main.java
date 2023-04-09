public class Main {
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123a12";
        if (isAllDigits(s1)) {
            System.out.println(s1 + " consists of digits only");
        } else {
            System.out.println(s1 + " contains non-digit characters");
        }
        if (isAllDigits(s2)) {
            System.out.println(s2 + " consists of digits only");
        } else {
            System.out.println(s2 + " contains non-digit characters");
        }
    }
}
