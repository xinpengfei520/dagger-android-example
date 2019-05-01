package cn.xpf.dagger2.ui.movie.inject;

import cn.xpf.dagger2.base.AppComponent;
import cn.xpf.dagger2.base.scope.ActivityScope;
import cn.xpf.dagger2.ui.movie.view.MovieListActivity;
import dagger.Component;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
@ActivityScope
@Component(modules = MovieModule.class, dependencies = AppComponent.class)
public interface MovieComponent {

    void inject(MovieListActivity activity);

}
