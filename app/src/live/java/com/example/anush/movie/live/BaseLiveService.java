package com.example.anush.movie.live;

import com.example.anush.movie.infrastructure.MoviesApp;
import com.squareup.otto.Bus;

/**
 * Created by ANUSH on 18-03-2018.
 */

public class BaseLiveService {
    protected MoviesApp application;
    Bus bus;

    public BaseLiveService(MoviesApp application) {
        this.application = application;
        bus=application.getBus();
        bus.register(this);
    }
}
