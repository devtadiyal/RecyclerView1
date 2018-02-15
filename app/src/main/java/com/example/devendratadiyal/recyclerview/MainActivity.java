package com.example.devendratadiyal.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Getter> list =  new ArrayList<>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rc);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       // For HardCore value
       for(int i=0;i<=10;i++)
        {
            Getter listItem = new Getter("Heading Text"+i+1,"Banner Text"+i);
            list.add(listItem);
        }
        adapter = new AdapterClass(list,this);
        recyclerView.setAdapter(adapter);


    }
}
