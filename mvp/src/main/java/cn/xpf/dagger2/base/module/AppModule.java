package cn.xpf.dagger2.base.module;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import cn.xpf.dagger2.MyApplication;
import dagger.Module;
import dagger.Provides;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@Module
public class AppModule {

    private Application mApplication;

    public AppModule(MyApplication application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    public Gson provideGson() {
        return new Gson();
    }

}