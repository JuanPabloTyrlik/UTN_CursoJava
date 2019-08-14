package clase11;

public class Calculator {

    public float sum(float arg1, float arg2) {
        return arg1 + arg2;
    }

    public float multiply(float arg1, float arg2) {
        return arg1 * arg2;
    }

    public float divide(float arg1, float arg2) throws ArithmeticException {
        if (arg2 == 0f) {
            throw new ArithmeticException();
        }
        return arg1 / arg2;
    }
}
