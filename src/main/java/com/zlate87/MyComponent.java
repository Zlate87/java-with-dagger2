package com.zlate87;

import dagger.Component;

@Component(modules = { MyModule.class })
public interface MyComponent {

    Executor getExecutor();
}
