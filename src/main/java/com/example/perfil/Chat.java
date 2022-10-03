package com.example.perfil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class Chat extends AppCompatActivity {

    private String mobile;
    private String email;
    private String name;
    private RecyclerView messagesRecyclerVIew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat2);

        messagesRecyclerVIew = findViewById(R.id.messagesRecyclerView);

        mobile = getIntent().getStringExtra("mobile");
        email = getIntent().getStringExtra("email");
        name = getIntent().getStringExtra("name");

        messagesRecyclerVIew.setHasFixedSize(true);
        messagesRecyclerVIew.setLayoutManager(new LinearLayoutManager(this));

        data

        }

    }
