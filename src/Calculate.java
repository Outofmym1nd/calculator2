public class Calculate {

    int calculate(int a, String operator, int b) {
        int x;

        switch (operator) {
            case ("+"):
                x = a + b;
                break;
            case ("-"):
                x = a - b;
                break;
            case ("*"):
                x = a * b;
                break;
            case ("/"):
                x = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return x;
    }
}
