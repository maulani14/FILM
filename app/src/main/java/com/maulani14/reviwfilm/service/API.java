package com.maulani14.reviwfilm.service;


import com.maulani14.reviwfilm.RetrofitClient;
import com.maulani14.reviwfilm.res.MovieApiService;

import retrofit2.Retrofit;

public class API {
    private static Retrofit retrofit = null;

    public static final String BASE_ROOT_URL = "http://5ce36e02e7bf4100144c64c4.mockapi.io/TopBoxOffice/";

    public static MovieApiService getApiService() {
        return RetrofitClient.getClient(BASE_ROOT_URL).create(MovieApiService.class);
    }

}
