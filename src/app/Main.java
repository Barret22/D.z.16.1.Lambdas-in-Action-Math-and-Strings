package app;

import functional.MathOperation;
import functional.StringManipulator;
import services.StringListProcessor;
import services.RandomNumberGenerator;

public class Main {

    public static void main(String[] args) {

        // Класс додавання
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition result: " + addition.operate(5, 3));

        // Лямбда для перетворення рядків
        StringManipulator toUpperCase = (String input) -> input.toUpperCase();
        System.out.println("Uppercase String: " + toUpperCase.manipulate("hello world"));

        // Рахуємо кількість головних букв
        String inputString = "Hello World!";
        int uppercaseCount = StringListProcessor.countUppercase(inputString);
        System.out.println("Uppercase letters count: " + uppercaseCount);

        // Генерація випадкового числа
        int randomNumber = RandomNumberGenerator.randomSupplier.get();
        System.out.println("Random number: " + randomNumber);
    }
}
