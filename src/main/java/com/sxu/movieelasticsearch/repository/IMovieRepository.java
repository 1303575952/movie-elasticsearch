package com.sxu.movieelasticsearch.repository;

import com.sxu.movieelasticsearch.entity.Movie;
import com.sxu.movieelasticsearch.entity.Page;
import com.sxu.movieelasticsearch.entity.QueryDTO;

public interface IMovieRepository {
    boolean save(Movie movie);

    Page<Movie> query(String queryString, int pageNo, int size);

    Page<Movie> query(QueryDTO queryDTO, int pageNo, int size);

    Movie get(String id);

}
