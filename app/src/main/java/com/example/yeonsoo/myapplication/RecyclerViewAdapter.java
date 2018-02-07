package com.example.yeonsoo.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;



/**
 * Created by yeonsoo on 2018. 2. 6..
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{


    private List<Movie> arrayList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<Movie> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        final Movie movie = arrayList.get(position);

        RecyclerViewHolder mainHolder =(RecyclerViewHolder)holder;

        Bitmap image = BitmapFactory.decodeResource(context.getResources(),
                movie.getImage());// This will convert drawbale image into
        // bitmap

        // setting title, review, image
        mainHolder.title.setText(movie.getTitle());
        mainHolder.review.setText(movie.getReview());
        mainHolder.imageView.setImageBitmap(image);

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_item, null);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(layoutView);
        return recyclerViewHolder;

    }

}
