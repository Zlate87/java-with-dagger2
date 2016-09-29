package com.zlate87;

public class Executor {

    private final DataBase dataBase;
    private final Calculator calculator;

    public Executor(DataBase dataBase, Calculator calculator) {
        this.dataBase = dataBase;
        this.calculator = calculator;
    }

    public void execute(String word) {
        System.out.println(String.format("Executor.execute([%s]) start", word));
        int calculatedValue = calculator.calculateSumOfAscii(word);
        dataBase.saveCalculatedValue(word, calculatedValue);
        System.out.println(String.format("Executor.execute([%s]) end", word));
    }
}
