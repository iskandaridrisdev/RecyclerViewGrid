package com.iskandar.recyclerviewgrid.recyclerviewgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.iskandar.recyclerviewgrid.recyclerviewgrid.adapter.AdapterGrid;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGrid;
    private AdapterGrid adapterGrid;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGrid =(RecyclerView)findViewById(R.id.rvGrid);
        layoutManager = new GridLayoutManager(this,2);
        rvGrid.setLayoutManager(layoutManager);

        ArrayList<String> items = new ArrayList<>();
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        items.add("ONE");
        adapterGrid = new AdapterGrid(items);
        rvGrid.setAdapter(adapterGrid);

    }
}
