package org.superbiz;

class CalculatorDecorator {

    private final Calculator calculator = new Calculator();

    String add(int a, int b) {
        final int result = calculator.add(a, b);
        return String.format("%d + %d = %d", a, b, result);
    }

    String multiply(int a, int b) {
        final int result = calculator.multiply(a, b);
        return String.format("%d X %d = %d", a, b, result);
    }

}
