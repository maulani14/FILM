package com.maulani14.reviwfilm;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    public static final String BASE_URL = "http://5ce36e02e7bf4100144c64c4.mockapi.io/TopBoxOffice";
    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory( GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    // Digunakan untuk intercept request/response HTTP
    private static HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
            .setLevel( HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    private ServiceGenerator() {

    }
    public static <Service> Service createService(Class<Service> serviceClass) {
        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
            builder.client(httpClient.build());
            retrofit = builder.build();
        }
        return retrofit.create(serviceClass);
    }

}
