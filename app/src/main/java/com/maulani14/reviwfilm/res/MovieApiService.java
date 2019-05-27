package com.maulani14.reviwfilm.res;
import com.maulani14.reviwfilm.model.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {
    @GET("/film")
    Call<List<MovieResponse>> readData();
}
