package com.plattysoft.snappinglist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView text;

    public ViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.item_text);
    }
}
