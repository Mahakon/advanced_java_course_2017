package edu.technopolis;

import java.math.BigInteger;

/**
 * Это <b>неправильный</b> с точки зрения задания алгоритм.
 */
public class DummyFibonacciAlgorithm implements FibonacciAlgorithm {
    @Override
    public String evaluate(int index) {
        /*
        if (index == 1) {
            return "0";
        }
        */

        return FibCounter.newInstance(index + 1).getNum();
    }
}
