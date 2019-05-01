package cn.xpf.dagger2.ui.movie.inject;

import cn.xpf.dagger2.base.scope.ActivityScope;
import cn.xpf.dagger2.ui.movie.contract.MovieContract;
import cn.xpf.dagger2.ui.movie.model.MovieModel;

import cn.xpf.dagger2.ui.movie.presenter.MoviePresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@Module
public class MovieModule {

    private MovieContract.View view;

    public MovieModule(MovieContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MovieContract.Model provideModel(MovieModel model) {
        return model;
    }

    @ActivityScope
    @Provides
    MovieContract.View provideView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MovieContract.Presenter providePresenter(MoviePresenter presenter) {
        return presenter;
    }
}
