package com.example.mvp_samplecode.ui;

import com.example.mvp_samplecode.pojo.MovieModel;

public class MoviePresenter {
    MovieView movieView ;

    public MoviePresenter(MovieView movieView) {
        this.movieView = movieView;
    }

    public MovieModel getDataFromDatabase(){
        return new MovieModel("case a way","very sad movie");
    }

    public void getAllData(){
        movieView.getData(getDataFromDatabase().getName(),getDataFromDatabase().getDescription());
    }
}
