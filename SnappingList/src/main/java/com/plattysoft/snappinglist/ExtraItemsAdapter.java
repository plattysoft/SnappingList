package com.plattysoft.snappinglist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExtraItemsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final int VIEW_TYPE_PADDING = 1;
    private static final int VIEW_TYPE_ITEM = 2;

    private final int mNumItems;

    public ExtraItemsAdapter(int numItems) {
        mNumItems = numItems;
    }

    @Override
    public int getItemCount() {
        return mNumItems+2; // We have to add 2 paddings
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0 || position == getItemCount()-1) {
            return VIEW_TYPE_PADDING;
        }
        return VIEW_TYPE_ITEM;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        if (viewType == VIEW_TYPE_ITEM) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ViewHolder(v);
        }
        else {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_padding, parent, false);
            return new ViewHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        if (getItemViewType(position) == VIEW_TYPE_ITEM) {
            // We bind the item to the view
            holder.text.setText(String.valueOf(position));
        }
    }
}
