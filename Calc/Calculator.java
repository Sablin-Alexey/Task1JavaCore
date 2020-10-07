package Calc;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    private Integer a = 0;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y != 0) {
             a = x/y;
        } else {
            System.out.println("нельзя делить на 0 ");}

        return a;
    };
// не было проверки при делении на ноль. Также будут ошибки при  делении ,т.к. тип Целочисленный.


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; // модуль работает исправно

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
