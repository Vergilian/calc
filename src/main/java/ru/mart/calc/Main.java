package ru.mart.calc;

import java.util.Scanner;
import ru.mart.calc.exception.InvalidInputFormatException;
import ru.mart.calc.factory.Factory;
import ru.mart.calc.factory.NumFactory;
import ru.mart.calc.factory.OperationFactory;
import ru.mart.calc.number.Num;
import ru.mart.calc.operation.Operation;
import ru.mart.calc.utils.StringUtils;

public class Main {

    private static final Calculator calculator = Calculator.getInstance();
    private static final Factory<Num> numFactory = NumFactory.getInstance();
    private static final Factory<Operation> operationFactory = OperationFactory.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] calcArguments = StringUtils.splitByWhitespace(input);
        if (calcArguments.length != 3) {
            throw new InvalidInputFormatException();
        }
        Num left = numFactory.createFromString(calcArguments[0]);
        Operation operation = operationFactory.createFromString(calcArguments[1]);
        Num right = numFactory.createFromString(calcArguments[2]);
        System.out.println(calculator.calculate(left, operation, right));
    }

}
