package cn.xpf.dagger2.base;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import cn.xpf.dagger2.base.module.ApiServiceModule;
import cn.xpf.dagger2.base.module.AppModule;
import cn.xpf.dagger2.base.module.HttpModule;
import cn.xpf.dagger2.manager.ServiceManager;
import dagger.Component;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class})
public interface AppComponent {

    Application application();

    ServiceManager serviceManager();

    Gson gson();

}
