package com.xpf.dagger.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:MainActivityComponent
 */
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {
    }

}
