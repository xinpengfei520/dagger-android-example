package com.xpf.dagger.di;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hero.printDefense(DaggerInjectActivity.this);
            }
        });
    }
}
