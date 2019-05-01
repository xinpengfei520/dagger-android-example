package cn.xpf.dagger2.base.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment {

    protected static final String TAG = "BaseFragment";
    protected BaseActivity mActivity;
    protected View mRootView;
    @Inject
    protected P mPresenter;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = initView(inflater, container, savedInstanceState);
        // 绑定到 ButterKnife
        mUnbinder = ButterKnife.bind(this, mRootView);
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mActivity = (BaseActivity) getActivity();
        ComponentInject();
        initData();
    }

    /**
     * 依赖注入的入口
     */
    protected abstract void ComponentInject();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mUnbinder != Unbinder.EMPTY) mUnbinder.unbind();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mPresenter = null;
        this.mActivity = null;
        this.mRootView = null;
        this.mUnbinder = null;
    }

    protected abstract View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    protected abstract void initData();

}
