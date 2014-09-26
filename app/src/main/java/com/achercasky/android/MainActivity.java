package com.achercasky.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.achercasky.android.adapter.MyRecyclerAdapter;
import com.achercasky.android.model.ViewModel;

import java.util.List;
import java.util.Random;


public class MainActivity extends Activity {

    private ViewModel  [] viewModel;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<ViewModel> viewModelList;
    private String[] sources = {
            "http://lorempixel.com/600/250/",
            "http://lorempixel.com/600/250/sports",
            "http://lorempixel.com/600/200/sports/Dummy-Text",
            "http://lorempixel.com/600/200/nature",
            "http://lorempixel.com/600/200/food",
    };
    private MyRecyclerAdapter myRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       viewModel = new ViewModel[]{new ViewModel("Hola"), new ViewModel("¿Que tal?"), new ViewModel("Bien"), new ViewModel("¿ Y vos?")};

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //No cambia el tamaño de la RecyclerView
        recyclerView.setHasFixedSize(true);

        //Usa un linea layout manager
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        myRecyclerAdapter = new MyRecyclerAdapter(viewModel);

        //Se le asigna el adapter al recycler
        recyclerView.setAdapter(myRecyclerAdapter);

        //Se le setea un animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    public static int randInt(int min, int max) {
        Random random = new Random();
        int numRandom = random.nextInt((max - min) +1) + min;

        return numRandom;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
//            if(myRecyclerAdapter != null) {
//                myRecyclerAdapter.a
//            }
            viewModel = new ViewModel[]{new ViewModel("Hola"), new ViewModel("¿Que tal?"), new ViewModel("Bien"), new ViewModel("¿ Y vos?")};
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
