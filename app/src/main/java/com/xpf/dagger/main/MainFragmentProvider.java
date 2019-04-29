package com.xpf.dagger.main;

import com.xpf.dagger.main.fragment.MainFragment;
import com.xpf.dagger.main.fragment.MainFragmentComponent;

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
public abstract class MainFragmentProvider {

    @Binds
    @IntoMap
    @ClassKey(MainFragment.class)
    abstract AndroidInjector.Factory<?> bindMainFragmentInjectorFactory(MainFragmentComponent.Factory factory);

}
