package com.example.anush.movie.live;

import com.example.anush.movie.infrastructure.MoviesApp;
import com.example.anush.movie.services.MovieServices;
import com.squareup.otto.Subscribe;

/**
 * Created by ANUSH on 18-03-2018.
 */

public class LiveMovieServices extends BaseLiveService {


    public LiveMovieServices(MoviesApp application) {
        super(application);
    }

    @Subscribe
    public void getMovireMessageAp(MovieServices.SearchMovieRequest request){
        MovieServices.SearchMovieResponse response=new MovieServices.SearchMovieResponse();
        response.modifyquery=request.query + "this added by me";
        bus.post(response);
    }


}
