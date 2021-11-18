package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailActivity extends AppCompatActivity {

    ImageView img_cover;
    TextView tv_title, tv_voteaverage, tv_overview, tv_releasedate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        img_cover = findViewById(R.id.img_cover);
        tv_title = findViewById(R.id.tv_title);
        tv_voteaverage = findViewById(R.id.tv_voteaverage);
        tv_overview = findViewById(R.id.tv_overview);
        tv_releasedate = findViewById(R.id.tv_releasedate);

        getIncomingExtra();

    }

    private void getIncomingExtra() {
        if(getIntent().hasExtra("mv_cover") && getIntent().hasExtra("mv_title") &&
        getIntent().hasExtra("mv_voteaverage") && getIntent().hasExtra("mv_overview") &&
        getIntent().hasExtra("mv_releasedate")){
            String cover = getIntent().getStringExtra("mv_cover");
            String title = getIntent().getStringExtra("mv_title");
            String voteaverage = getIntent().getStringExtra("mv_voteaverage");
            String overview = getIntent().getStringExtra("mv_overview");
            String releasedate = getIntent().getStringExtra("mv_releasedate");

            setDataActivity(cover, title, voteaverage, overview, releasedate);

        }
    }

    private void setDataActivity(String cover, String title, String voteaverage,
                                 String overview, String releasedate) {

        Glide.with(this).asBitmap().load(cover).into(img_cover);

        tv_title.setText(title);
        tv_voteaverage.setText(voteaverage);
        tv_overview.setText(overview);
        tv_releasedate.setText(releasedate);

    }
}