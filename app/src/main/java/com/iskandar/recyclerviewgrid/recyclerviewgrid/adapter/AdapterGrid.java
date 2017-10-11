package com.iskandar.recyclerviewgrid.recyclerviewgrid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iskandar.recyclerviewgrid.recyclerviewgrid.R;

import java.util.ArrayList;

/**
 * Created by ISKANDAR-ETS on 10/11/2017.
 */

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.GridHolder> {
    private ArrayList<String> ListItems;

    public AdapterGrid(ArrayList<String> listItems) {
        this.ListItems = listItems;
    }

    @Override
    public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item, parent, false);

        return new GridHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GridHolder holder, int position) {
        String val = ListItems.get(position);
        holder.tvItem.setText(val);
    }

    @Override
    public int getItemCount() {
        return ListItems.size();
    }

    public class GridHolder extends RecyclerView.ViewHolder {
        public TextView tvItem;

        public GridHolder(View view) {
            super(view);
            tvItem = (TextView) view.findViewById(R.id.tvItem);
        }
    }
}
