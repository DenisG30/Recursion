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


    public static void EvenValues(List<Integer> list) {
        ProcessEvenValues(list, 0);
    }

    private static void ProcessEvenValues(List<Integer> list, int index) {
        if (index >= list.size()) {
           return;
        }
        if (list.get(index) % 2 == 0) {
            System.out.print(list.get(index) + " ");
        }
        ProcessEvenValues(list, index + 1);
    }


    public static List<Integer> EvenIndex(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }
        return ProcessEvenIndex(list, 0);
    }

    private static List<Integer> ProcessEvenIndex(List<Integer> list, int index) {
        List<Integer> evenIndexElements = new ArrayList<>();
        if (index >= list.size()) {
           return evenIndexElements;
        }
        evenIndexElements.add(list.get(index));
        evenIndexElements.addAll(ProcessEvenIndex(list, index + 2));
        return evenIndexElements; 
    }
}
