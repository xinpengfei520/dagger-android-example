package cn.xpf.dagger2.manager;

import javax.inject.Inject;
import javax.inject.Singleton;

import cn.xpf.dagger2.api.ApiService;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@Singleton
public class ServiceManager {

    @Inject
    public ApiService mUserService;

    @Inject
    public ServiceManager(){

    }

}
