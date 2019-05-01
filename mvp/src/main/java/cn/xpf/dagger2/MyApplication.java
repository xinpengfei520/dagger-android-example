package cn.xpf.dagger2;

import android.app.Application;


import cn.xpf.dagger2.base.AppComponent;
import cn.xpf.dagger2.base.DaggerAppComponent;
import cn.xpf.dagger2.base.module.ApiServiceModule;
import cn.xpf.dagger2.base.module.AppModule;
import cn.xpf.dagger2.base.module.HttpModule;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public class MyApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .httpModule(new HttpModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
