package com.nitish.imageloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList imagelist = new ArrayList();
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);

setArrayList();

// setting up the recyclerview
RecyclerviewAdapter recyclerviewAdapter = new RecyclerviewAdapter(this,imagelist);
recyclerView.setAdapter(recyclerviewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
    public void setArrayList()
    {
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg");
        imagelist.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg");
    }
}