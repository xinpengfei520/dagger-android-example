package com.example.atom.daggerinjection.main.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author qiuyunfei
 * @date 2018/8/29
 * @description
 */
@Subcomponent(modules = {MainFragmentMudole.class})
public interface MainFragmentComponent extends AndroidInjector<MainFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment> {
    }
}