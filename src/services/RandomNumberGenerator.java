package services;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static Supplier<Integer> randomSupplier = () -> generateRandomNumber(1, 100);
}
