package com.xpf.dagger.main;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.xpf.dagger.R;
import com.xpf.dagger.di.DaggerInjectActivity;
import com.xpf.dagger.main.fragment.MainFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector, HasFragmentInjector, IMainView {

    @Inject
    DispatchingAndroidInjector<android.support.v4.app.Fragment> androidSupportFragmentInjector;
    @Inject
    DispatchingAndroidInjector<android.app.Fragment> androidFragmentInjector;
    @Inject
    MainPresenter mPresenter;

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);
        mPresenter.load();
    }

    @Override
    public void onLoaded() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, MainFragment.newInstance())
                .commitAllowingStateLoss();

        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Hello Dagger 2.1 ~");
            }
        }, 2000);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DaggerInjectActivity.class));
            }
        });
    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return androidFragmentInjector;
    }

    @Override
    public AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return androidSupportFragmentInjector;
    }
}
