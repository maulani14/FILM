package com.maulani14.reviwfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // private static final String TAG = MainActivity.class.getName();

    private ImageView movie_image;
    private TextView title,date,sutradara;
    private ServiceGenerator service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie_image = findViewById(R.id.movie_image);
        title = findViewById(R.id.title);
        date = findViewById(R.id.date);
        sutradara = findViewById(R.id.sutradara);
        service = ServiceGenerator.createService(ServiceGenerator.class);

    }
}
