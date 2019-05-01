package com.xpf.dagger.main.fragment;

import javax.inject.Inject;

/**
 * Created by x-sir on 2019/5/1 :)
 * Function:
 */
public class MainFragmentPresenter {

    private IMainFragmentView mainFragmentView;

    @Inject
    public MainFragmentPresenter(IMainFragmentView mainFragmentView) {
        this.mainFragmentView = mainFragmentView;
    }

    public void onMainFragmentLoaded() {
        mainFragmentView.onMainFragmentLoaded();
    }
}
