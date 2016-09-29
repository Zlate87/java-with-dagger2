package com.zlate87;

public class Main {

    public static void main(String[] args) {
        MyComponent myComponent = DaggerMyComponent.builder().build();
        Executor executor = myComponent.getExecutor();
        executor.execute("test");
    }

}
