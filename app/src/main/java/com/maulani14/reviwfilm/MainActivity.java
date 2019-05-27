package com.maulani14.reviwfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.maulani14.reviwfilm.model.MovieResponse;
import com.maulani14.reviwfilm.res.MovieApiService;
import com.maulani14.reviwfilm.service.API;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public List<MovieResponse> movies = new ArrayList<MovieResponse>();
    private MovieApiService mApiService;
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvView = (RecyclerView) findViewById(R.id.recycler_view);
        rvView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        rvView.setLayoutManager(layoutManager);

        mApiService = API.getApiService();
        movies.clear();
        mApiService.readData().enqueue(new Callback<List<MovieResponse>>() {
            @Override
            public void onResponse(Call<List<MovieResponse>> call, Response<List<MovieResponse>> response) {
                Toast.makeText(MainActivity.this, "Berhasil memproses data dari APi", Toast.LENGTH_SHORT).show();
                for (int i = 0; i <response.body().size() ; i++) {
                    MovieResponse mv = new MovieResponse();
                    mv.setPoster(response.body().get(i).getPoster());
                    mv.setName (response.body().get(i).getName ());
                    mv.setTahun(response.body().get(i).getTahun());
                    mv.setSutradara(response.body().get(i).getSutradara());
                    movies.add(mv);
                }

                adapter = new MovieAdapter (movies,getApplicationContext());
                rvView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<MovieResponse>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Gagal memproses data dari APi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
