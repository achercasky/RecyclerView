package com.achercasky.android.model;

import android.view.View;

/**
 * Created by Ariel on 25/09/2014.
 */
public class ViewModel {

    private int id;
    private int url;
    private String title;

    public ViewModel(String title){
        this.title = title;
    }

//    public ViewModel(int id, int url) {
//        this.id = id;
//        this.url = url;
//    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getUrl() {
        return url;
    }
}
