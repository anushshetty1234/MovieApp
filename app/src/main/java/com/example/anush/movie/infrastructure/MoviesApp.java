package com.example.anush.movie.infrastructure;

import android.app.Application;

import com.example.anush.movie.live.Module;
import com.squareup.otto.Bus;

/**
 * Created by ANUSH on 17-03-2018.
 */

public class MoviesApp extends Application {

    private Bus bus;

    public MoviesApp() {
        bus=new Bus();

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Module.Register(this);
    }

    public Bus getBus() {
        return bus;
    }
}
