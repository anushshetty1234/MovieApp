package com.example.anush.movie.services;

/**
 * Created by ANUSH on 18-03-2018.
 */

public class MovieServices {

    private MovieServices() {
    }

    public static class SearchMovieRequest{
        public String query;

        public SearchMovieRequest(String query) {
            this.query = query;
        }
    }

    public static class SearchMovieResponse{

        public String modifyquery;
    }


}
