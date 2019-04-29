package com.xpf.dagger.main;

import com.xpf.dagger.api.ApiService;

import javax.inject.Inject;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:
 */
@SuppressWarnings("WeakerAccess")
public class MainPresenter {

    IMainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenter(IMainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void load() {
        apiService.loadData();
        mainView.onLoaded();
    }
}
