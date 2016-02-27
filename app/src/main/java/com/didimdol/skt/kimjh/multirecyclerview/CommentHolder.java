package com.didimdol.skt.kimjh.multirecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kimjh on 2016-02-25.
 */
public class CommentHolder extends RecyclerView.ViewHolder {
    TextView userId;
    TextView userComment;

    public CommentHolder(View itemView) {
        super(itemView);
        userId = (TextView)itemView.findViewById(R.id.text_user);
        userComment = (TextView)itemView.findViewById(R.id.text_comment);
    }

    public void setComment (CommentData data){
        userId.setText(data.userId);
        userComment.setText(data.userComment);
    }
}
