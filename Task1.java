public class Task1 {
    public static double Exponentiation(double x, int y) {
        if (x == 0 && y <= 0){
            throw new ArithmeticException("Невозможно рассчитать");
        }
        if (x == 1 || x == 0) {
            return x;
        }
        if (y > 1 ) {
            return x * Exponentiation(x, --y);
        }
        if (y < 1 ) {
            return 1 / x * Exponentiation(x, ++y);
        }
        return x;
    }

    
    public static int SumOfDigit(int x){
        if (x < 0){
            throw new ArithmeticException("Число меньше 0");
        }
        if(x < 10 && x >= 0) {
            return x;
        } 
        return (x % 10 + SumOfDigit(x / 10));
    }

    
    public static int lengthList(ArrayList<?> list){
        if (list.isEmpty()) {
            return 0;
        }
        list.removeFirst();
        return 1 + lengthList(list);
    }


    public static boolean Palindrom(String x){
        if (x.length() <= 1){
            return true;
        }
        return ProcessIdElemOfPalindrom(x, 0);
    }
    private static boolean ProcessIdElemOfPalindrom(String x, int step) {
        int left = step;
        int right = x.length() - 1 - step;
        if (left >= right) {
            return true;
        }
        if (x.charAt(left) != x.charAt(right)) {
            return false;
        }
        return ProcessIdElemOfPalindrom(x, step + 1);
    }
}
