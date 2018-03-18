package com.example.anush.movie.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.anush.movie.R;
import com.example.anush.movie.services.MovieServices;
import com.squareup.otto.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.activity_main)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bus.post(new MovieServices.SearchMovieRequest("query"));

    }

    @Subscribe
    public void getMovieMessage(MovieServices.SearchMovieResponse response){
        textView.setText(response.modifyquery);

    }

}
