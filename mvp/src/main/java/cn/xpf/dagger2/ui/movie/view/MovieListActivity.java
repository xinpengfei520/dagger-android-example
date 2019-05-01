package cn.xpf.dagger2.ui.movie.view;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import butterknife.BindView;
import cn.xpf.dagger2.R;
import cn.xpf.dagger2.adapter.MovieListAdapter;
import cn.xpf.dagger2.base.AppComponent;
import cn.xpf.dagger2.base.mvp.BaseActivity;
import cn.xpf.dagger2.bean.MovieRespBean;
import cn.xpf.dagger2.ui.movie.contract.MovieContract;
import cn.xpf.dagger2.ui.movie.inject.DaggerMovieComponent;
import cn.xpf.dagger2.ui.movie.inject.MovieModule;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public class MovieListActivity extends BaseActivity<MovieContract.Presenter> implements MovieContract.View {

    @BindView(R.id.listView)
    ListView listView;

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMovieComponent
                .builder()
                .appComponent(appComponent)
                .movieModule(new MovieModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected View initView() {
        return LayoutInflater.from(mContext).inflate(R.layout.activity_login, null, false);
    }

    @Override
    protected void initData() {
        mPresenter.getMovieList();
    }

    @Override
    public void onSuccess(MovieRespBean movieRespBean) {
        List<MovieRespBean.TrailersBean> trailers = movieRespBean.getTrailers();
        listView.setAdapter(new MovieListAdapter(this,trailers));
    }
}
