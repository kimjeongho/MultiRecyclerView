package com.didimdol.skt.kimjh.multirecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by kimjh on 2016-02-25.
 */
public class MoreHolder extends RecyclerView.ViewHolder {
    ImageButton moreView;
    public MoreHolder(View itemView) {
        super(itemView);
        moreView = (ImageButton)itemView.findViewById(R.id.btn_more);
    }
}
