package com.xpf.dagger.main.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:MainFragmentComponent
 */
@Subcomponent(modules = {MainFragmentModule.class})
public interface MainFragmentComponent extends AndroidInjector<MainFragment> {

    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainFragment> {
    }
}
