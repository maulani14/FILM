package com.maulani14.reviwfilm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.maulani14.reviwfilm.model.MovieResponse;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<MovieResponse> rvData;
    private Context context;

    public MovieAdapter(List<MovieResponse> inputData,Context context) {
        this.rvData = inputData;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView movie_image;
        public TextView title,aktor,sutradara,tahun;

        public ViewHolder( View v) {
            super(v);
            movie_image = v.findViewById(R.id.movie_image);
            title = v.findViewById(R.id.title);
            aktor = v.findViewById(R.id.aktor);
            sutradara= v.findViewById(R.id.sutradara);
            tahun= v.findViewById(R.id.tahun);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_movie, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(this.context)
                .load(rvData.get(position).getPoster())
                .diskCacheStrategy( DiskCacheStrategy.ALL)
                .into(holder.movie_image);
        holder.title.setText(rvData.get(position).getJudul ());
        holder.aktor.setText(rvData.get(position).getActors ());
        holder.sutradara.setText(rvData.get(position).getSutradara());
        holder.tahun.setText(rvData.get(position).getTahun ());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
