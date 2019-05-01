package com.xpf.dagger.main;

import com.xpf.dagger.api.ApiService;
import com.xpf.dagger.main.fragment.MainFragmentComponent;
import com.xpf.dagger.main.fragment.MainFragmentProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:
 */
@Module(subcomponents = MainFragmentComponent.class, includes = MainFragmentProvider.class)
public class MainActivityModule {

    @Provides
    IMainView provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    MainPresenter provideMainPresenter(IMainView mainView, ApiService apiService) {
        return new MainPresenter(mainView, apiService);
    }
}
