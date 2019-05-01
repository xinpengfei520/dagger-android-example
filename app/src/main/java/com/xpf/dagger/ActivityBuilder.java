package com.xpf.dagger;

import com.xpf.dagger.main.MainActivity;
import com.xpf.dagger.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?> bindMainActivity(MainActivityComponent.Factory factory);

//    @ContributesAndroidInjector(modules = MainActivityModule.class)
//    abstract MainActivity bindMainActivity();
//
//    @ContributesAndroidInjector(modules = {MainActivityModule.class, MainFragmentProvider.class})
//    abstract MainActivity bindMainActivity();
}
