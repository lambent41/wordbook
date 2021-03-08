package com.example.wordbook;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

class AllActivity extends AppCompatActivity {

    final RecyclerView rv_layout = findViewById(R.id.rv_item);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv_layout.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        CustomAdapter myCustomAdapter = new CustomAdapter(data, this);
        rv_layout.setAdapter(myCustomAdapter);
    }
}
