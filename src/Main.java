import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 целых числа в диапазоне от 1-10 или I-X, и знак арифметического действия между ними: ");
        BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        String cl = calc.readLine();   //переменная, в которой хранится содержимое строки
        try {
            String[] numbers = cl.split(" ");  //принимаем за разделитель пробел
            String a = numbers[0];  //первая цифра
            String operator = numbers[1];  //арифметический оператор
            String b = numbers[2];  //вторая цифра
            Validate validate = new Validate();
            Action action = new Action();
            Calculate calculate = new Calculate();

            if (validate.checkRomeSymbol(a)) {  //проверяем первую цифру на римские
                if (validate.checkRomeSymbol(b)) {  //проверяем вторую цифру на римские
                    int x = calculate.calculate(action.getRomeMapSymbol(a), operator, action.getRomeMapSymbol(b));  //переводим римские в арабские, вычисляем значение
                    System.out.println(action.getArabMapSymbol(x));  //переводим обратно в римские
                } else System.err.println("Ошибка ввода данных 0");
            } else if (validate.checkArabSymbol(a)) {  //проверяем первую цифру на арабские
                if (validate.checkArabSymbol(b)) {  //проверяем вторую цифру на арабские
                    System.out.println(calculate.calculate(Integer.parseInt(a), operator, Integer.parseInt(b)));  //вычисляем значение
                } else System.err.println("Ошибка ввода данных 1");
            } else System.err.println("Ошибка ввода данных 2");
        } catch (Exception e) {
            System.err.println("Ошибка ввода данных 3");
        }
    }
}