package com.example.yeonsoo.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yeonsoo on 2018. 2. 7..
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder{

    public TextView title;
    public TextView review;
    public ImageView imageView;


    public RecyclerViewHolder(View view){
        super(view);

        this.title = (TextView)view.findViewById(R.id.movie_title);
        this.review = (TextView)view.findViewById(R.id.movie_review);
        this.imageView = (ImageView) view.findViewById(R.id.movie_photo);

    }
}
