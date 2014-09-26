package com.achercasky.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.achercasky.android.R;
import com.achercasky.android.model.ViewModel;

import java.util.List;

/**
 * Created by Ariel on 24/09/2014.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{

    private List<ViewModel> viewModelList;
    private ViewModel [] viewModels;

    private Context context;
//
//    public MyRecyclerAdapter(List<ViewModel> viewModelList){
//        this.viewModelList = viewModelList;
//    }
    public MyRecyclerAdapter(ViewModel [] viewModels){
        this.viewModels = viewModels;
    }

    /**
     * Crea las nuevas vistas
     * @param viewGroup
     * @param i
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_view_model, null);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    /**
     * Reemplaza el contenido de las vistas
     * @param viewHolder
     * @param i
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

//        viewHolder.imageView.setImageResource(viewModelList.get(i).getUrl());
        viewHolder.textView.setText(viewModels[i].getTitle());
    }

    @Override
    public int getItemCount() {
        return viewModels.length;
    }

    //Crea el ViewHolder para hacer referencia a las vistas
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        /**
         * Contructor que contiene las vistas de cada elemento
         *
         * @param itemView
         */
        public ViewHolder(View itemView) {
            super(itemView);
//            imageView = (ImageView) itemView.findViewById(R.id.image);
            textView = (TextView) itemView.findViewById(R.id.item_title);
        }
    }
}
