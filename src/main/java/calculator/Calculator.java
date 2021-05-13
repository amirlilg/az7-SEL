package calculator;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int divide(int a, int b) {
        return a/b;
    }

    public int power(int a, int b) {
//        return Math.pow(a,b);

        int b1 = b;
        int result = 1;
        while (b1 !=0){
            result *= a;
            b1 = b1 - 1;
        }
        return result;
    }
}
