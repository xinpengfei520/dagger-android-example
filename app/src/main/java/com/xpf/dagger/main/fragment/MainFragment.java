package com.xpf.dagger.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xpf.dagger.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:
 */
public class MainFragment extends DaggerFragment implements IMainFragmentView {

    private static final String TAG = "MainFragment";
    @Inject
    MainFragmentPresenter mainFragmentPresenter;
    private TextView textView;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_main, null);
        textView = view.findViewById(R.id.textView);
        mainFragmentPresenter.onMainFragmentLoaded();
        return view;
    }

    @Override
    public void onMainFragmentLoaded() {
        Log.d(TAG, "onMainFragmentLoaded()");
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Hello MainFragment~");
            }
        }, 2000);
    }
}
