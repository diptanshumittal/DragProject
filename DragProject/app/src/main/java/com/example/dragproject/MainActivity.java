package com.example.dragproject;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView cardRecycleView;
    CardAdapter cardAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardRecycleView = findViewById(R.id.news_rv);
        cardAdapter = new CardAdapter(this);
        cardRecycleView.setAdapter(cardAdapter);
        cardRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
