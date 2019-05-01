package cn.xpf.dagger2.base.mvp;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public class BasePresenter<M extends IModel, V extends IView> {

    protected static final String TAG = "BasePresenter";

    @Inject
    protected M mModel;
    @Inject
    protected V mView;

    public BasePresenter() {

    }

    protected Context getContext() {
        return (Context) mView;
    }

}
