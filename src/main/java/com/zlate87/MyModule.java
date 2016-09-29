package com.zlate87;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class MyModule {

    @Provides
    @Singleton
    Mapper provideMapper() {
        return new Mapper();
    }

    @Provides
    @Singleton
    Calculator provideCalculator(Mapper mapper) {
        return new Calculator(mapper);
    }

    @Provides
    @Singleton
    DataBase provideDatabase() {
        return new DataBase();
    }

    @Provides
    @Singleton
    Executor provideExecutor(DataBase database, Calculator calculator) {
        return new Executor(database, calculator);
    }
}
