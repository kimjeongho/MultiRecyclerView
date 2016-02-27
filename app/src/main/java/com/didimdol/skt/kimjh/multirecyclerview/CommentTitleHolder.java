package com.didimdol.skt.kimjh.multirecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kimjh on 2016-02-25.
 */
public class CommentTitleHolder extends RecyclerView.ViewHolder {
    TextView commentTitleView;

    public CommentTitleHolder(View itemView) {
        super(itemView);
        commentTitleView = (TextView)itemView.findViewById(R.id.commentTitle);
    }


}
