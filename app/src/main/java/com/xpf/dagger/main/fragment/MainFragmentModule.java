package com.xpf.dagger.main.fragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:
 */
@Module
public class MainFragmentModule {

    @Provides
    IMainFragmentView provideFragmentView(MainFragment mainFragment) {
        return mainFragment;
    }
}
