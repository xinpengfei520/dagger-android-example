package com.xpf.dagger.di;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:DaggerInjectModule
 */
@Module(subcomponents = DaggerInjectComponent.class)
public abstract class DaggerInjectModule {

    @Binds
    @IntoMap
    @ClassKey(DaggerInjectActivity.class)
    abstract AndroidInjector.Factory<?> bindDaggerInjectActivityInjectorFactory(DaggerInjectComponent.Factory factory);
}
