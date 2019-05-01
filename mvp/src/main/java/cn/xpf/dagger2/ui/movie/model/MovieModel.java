package cn.xpf.dagger2.ui.movie.model;


import javax.inject.Inject;

import cn.xpf.dagger2.base.mvp.BaseModel;
import cn.xpf.dagger2.base.scope.ActivityScope;
import cn.xpf.dagger2.bean.MovieRespBean;
import cn.xpf.dagger2.manager.ServiceManager;
import cn.xpf.dagger2.ui.movie.contract.MovieContract;
import io.reactivex.Observable;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@ActivityScope
public class MovieModel extends BaseModel implements MovieContract.Model {

    @Inject
    ServiceManager mServiceManager;

    @Inject
    public MovieModel() {

    }

    @Override
    public Observable<MovieRespBean> getMovieList() {
        return mServiceManager.mUserService.getMovieList();
    }

}
