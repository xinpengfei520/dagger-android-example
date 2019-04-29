package com.xpf.dagger;

import com.xpf.dagger.di.DaggerInjectModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:自定义 component 构造器
 * AndroidSupportInjectionModule.class:这是 Dagger2.1 初始化必须的 module，由 Dagger 内部完成，
 * 用于提供各种 AndroidInjector, 我们只需要固定加上即可。
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class,
        DaggerInjectModule.class})
public interface AppComponent extends AndroidInjector<MyApplication> {

    @Override
    void inject(MyApplication instance);
}
