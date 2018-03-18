package com.example.anush.movie.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.anush.movie.infrastructure.MoviesApp;
import com.squareup.otto.Bus;

/**
 * Created by ANUSH on 17-03-2018.
 */

public class BaseActivity extends AppCompatActivity{

    protected MoviesApp appliction;
    protected Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appliction=(MoviesApp) getApplication();
        bus=appliction.getBus();
        bus.register(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
