package com.xpf.dagger.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:DaggerInjectComponent
 */
@Subcomponent
public interface DaggerInjectComponent extends AndroidInjector<DaggerInjectActivity> {

    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DaggerInjectActivity> {
    }
}
