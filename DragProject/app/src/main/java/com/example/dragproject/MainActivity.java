package com.example.dragproject;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    RecyclerView cardRecycleView;
    CardAdapter cardAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fsg","oncreate executed ");
        cardRecycleView = findViewById(R.id.news_rv);
        //cardAdapter = new CardAdapter(this);
        //cardRecycleView.setAdapter(cardAdapter);
        //cardRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
