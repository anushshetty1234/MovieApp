package com.example.anush.movie.live;

import com.example.anush.movie.infrastructure.MoviesApp;

/**
 * Created by ANUSH on 18-03-2018.
 */

public class Module {

    public static void Register(MoviesApp application){
        new LiveMovieServices(application);
    }

}
