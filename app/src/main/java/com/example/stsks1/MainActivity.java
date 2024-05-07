package com.example.stsks1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int imgages[] = {R.drawable.a,R.drawable.allindia,R.drawable.ambulance,R.drawable.android};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.languages);
        s2 = getResources().getStringArray(R.array.description);
    }
}