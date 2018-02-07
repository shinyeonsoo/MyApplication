package com.example.yeonsoo.myapplication;

/**
 * Created by yeonsoo on 2018. 2. 6..
 */

public class Movie {

    private String title;
    private String review;
    private int image;


    public Movie(String title, String review, int image){
        this.title = title;
        this.review = review;
        this.image = image;

    }

    public String getTitle(){
        return title;
    }

    public String getReview(){
        return review;
    }

    public int getImage(){
        return image;
    }

}
