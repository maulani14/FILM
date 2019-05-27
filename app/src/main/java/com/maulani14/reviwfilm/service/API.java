package com.maulani14.reviwfilm.service;


import com.maulani14.reviwfilm.ServiceGenerator;
import com.maulani14.reviwfilm.model.MovieResponse;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class API {
    private static Retrofit retrofit = null;

    public static Retrofit getClientEvent() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl( ServiceGenerator.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory( GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
