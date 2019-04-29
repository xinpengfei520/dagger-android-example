package com.xpf.dagger;

import android.app.Application;
import android.content.Context;

import com.xpf.dagger.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:
 */
@Module(subcomponents = {MainActivityComponent.class})
public abstract class AppModule {

    @Binds
    abstract Context provideContext(Application application);
}
