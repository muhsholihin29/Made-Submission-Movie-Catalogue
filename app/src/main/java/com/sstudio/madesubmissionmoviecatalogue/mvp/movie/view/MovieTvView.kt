package com.sstudio.madesubmissionmoviecatalogue.mvp.movie.view

import com.sstudio.madesubmissionmoviecatalogue.model.Genres
import com.sstudio.madesubmissionmoviecatalogue.model.MovieTv
import com.sstudio.madesubmissionmoviecatalogue.model.MovieTvHome
import com.sstudio.madesubmissionmoviecatalogue.model.MoviesResponse

interface MovieTvView {
    fun showMoviesTvHome(moviesTv : List<MovieTvHome>?)
    fun updateMoviesTvPage(moviesTv : List<MovieTv>?)
    fun showMoviesTv(moviesTv : List<MovieTv>?)
    fun showGenreList(genreList : List<Genres.Genre>?)
    fun failShowMoviesTv(text: String?)
    fun spanCountGridLayout(i: Int)
    fun broadcastIntent()
}