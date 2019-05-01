package cn.xpf.dagger2.base.module;

import javax.inject.Singleton;

import cn.xpf.dagger2.api.ApiService;
import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@Module
public class ApiServiceModule {

    @Singleton
    @Provides
    HttpUrl provideBaseUrl() {
        return HttpUrl.parse("http://api.m.mtime.cn");
    }

    @Singleton
    @Provides
    ApiService provideUserService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

}
