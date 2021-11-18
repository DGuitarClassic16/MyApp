package com.example.myapp;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mvCover = new ArrayList<>();
    private ArrayList<String> mvTitle = new ArrayList<>();
    private ArrayList<String> mvVoteAverage = new ArrayList<>();
    private ArrayList<String> mvOverview = new ArrayList<>();
    private ArrayList<String> mvReleaseDate = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> mvCover, ArrayList<String> mvTitle, ArrayList<String> mvVoteAverage, ArrayList<String> mvOverview, ArrayList<String> mvReleaseDate, Context context) {
        this.mvCover = mvCover;
        this.mvTitle = mvTitle;
        this.mvVoteAverage = mvVoteAverage;
        this.mvOverview = mvOverview;
        this.mvReleaseDate = mvReleaseDate;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Glide.with(context).asBitmap().load(mvCover.get(position)).into(holder.cover );

        holder.title.setText(mvTitle.get(position));
        holder.voteaverage.setText(mvVoteAverage.get(position));
        holder.overview.setText(mvOverview.get(position));
        holder.releasedate.setText(mvReleaseDate.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, mvTitle.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent (context, MovieDetailActivity.class);

                intent.putExtra("mv_cover", mvCover.get(position));
                intent.putExtra("mv_title", mvTitle.get(position));
                intent.putExtra("mv_voteaverage", mvVoteAverage.get(position));
                intent.putExtra("mv_overview", mvOverview.get(position));
                intent.putExtra("mv_releasedate", mvReleaseDate.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mvTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cover;
        TextView title, voteaverage, overview, releasedate;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cover = itemView.findViewById(R.id.img_cover);
            title = itemView.findViewById(R.id.tv_title);
            voteaverage = itemView.findViewById(R.id.tv_voteaverage);
            overview = itemView.findViewById(R.id.tv_overview);
            releasedate = itemView.findViewById(R.id.tv_releasedate);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}