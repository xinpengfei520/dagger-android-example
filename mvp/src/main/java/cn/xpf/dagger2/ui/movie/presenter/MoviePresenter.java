package cn.xpf.dagger2.ui.movie.presenter;

import android.util.Log;

import javax.inject.Inject;

import cn.xpf.dagger2.base.mvp.BasePresenter;
import cn.xpf.dagger2.base.scope.ActivityScope;
import cn.xpf.dagger2.bean.MovieRespBean;
import cn.xpf.dagger2.ui.movie.contract.MovieContract;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@ActivityScope
public class MoviePresenter extends BasePresenter<MovieContract.Model, MovieContract.View> implements MovieContract.Presenter {

    private static final String TAG = "MoviePresenter";

    @Inject
    MoviePresenter() {

    }

    @Override
    public void getMovieList() {
        Disposable disposable = mModel.getMovieList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MovieRespBean>() {
                    @Override
                    public void accept(MovieRespBean movieRespBean) throws Exception {
                        mView.onSuccess(movieRespBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e(TAG, "Error:"+throwable.getMessage());
                    }
                });
    }

    @Override
    public void onDestroy() {

    }

}
