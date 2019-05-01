package cn.xpf.dagger2.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.xpf.dagger2.MyApplication;
import cn.xpf.dagger2.base.AppComponent;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity {

    protected static final String TAG = "BaseActivity";
    protected MyApplication mApplication;
    private Unbinder mUnbinder;
    @Inject
    protected P mPresenter;
    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplication = (MyApplication) getApplication();
        mContext = this;
        setContentView(initView());
        mUnbinder = ButterKnife.bind(this);
        setupActivityComponent(mApplication.getAppComponent());
        initData();
    }

    /**
     * 依赖注入的入口
     */
    protected abstract void setupActivityComponent(AppComponent appComponent);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != Unbinder.EMPTY) mUnbinder.unbind();
        this.mPresenter = null;
        this.mUnbinder = null;
        this.mApplication = null;
    }

    protected abstract View initView();

    protected abstract void initData();

}
