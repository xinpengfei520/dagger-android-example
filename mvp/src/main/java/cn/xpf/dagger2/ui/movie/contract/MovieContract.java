package cn.xpf.dagger2.ui.movie.contract;

import cn.xpf.dagger2.base.mvp.IModel;
import cn.xpf.dagger2.base.mvp.IPresenter;
import cn.xpf.dagger2.base.mvp.IView;
import cn.xpf.dagger2.bean.MovieRespBean;
import io.reactivex.Observable;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public interface MovieContract {

    interface Model extends IModel {
        Observable<MovieRespBean> getMovieList();
    }

    interface View extends IView {
        void onSuccess(MovieRespBean movieRespBean);
    }

    interface Presenter extends IPresenter {
        void getMovieList();
    }

}
