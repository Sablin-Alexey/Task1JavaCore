package Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        Scanner scanner =new Scanner(System.in);
        int a = calc.plus.apply(4, 2);
        int b = calc.minus.apply(6,6);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(c,a);
        System.out.println("введите число для извлечение модуля");
        int e = calc.abs.apply(scanner.nextInt());
        int f = calc.pow.apply(d);

        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);



    }

}

