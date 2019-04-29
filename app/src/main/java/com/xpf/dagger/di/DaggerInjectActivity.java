package com.xpf.dagger.di;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xpf.dagger.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class DaggerInjectActivity extends AppCompatActivity {

    @Inject
    Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // call before super.onCreate()
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_inject);
        // 调用方法
        hero.printDefense();
    }
}
