package br.com.mdantas.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

/**
 * @author marcelo.dantas
 */
public class TesteLambdas {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };

        System.out.println(intBinaryOperator.applyAsInt(1, 1));

        BiFunction<Integer, Integer, Integer> bifunctions = (Integer a, Integer b) -> {
            return a + b;
        };

        System.out.println(bifunctions.apply(10, 10));

        BiFunction<Double, Double, String> bifunctionsStr = (Double a, Double b) -> {
            Double re = a + b;
            return String.valueOf(re);
        };

        System.out.println("String: " + bifunctionsStr.apply(10d, 10d));

        Runnable hello_world = () -> System.out.println("Hello World!");
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value");

        Supplier<Integer> integerCallable = () -> 42;
        Supplier<Double> doubleCallable = () -> {
            return 3.1415;
        };
    }
}
