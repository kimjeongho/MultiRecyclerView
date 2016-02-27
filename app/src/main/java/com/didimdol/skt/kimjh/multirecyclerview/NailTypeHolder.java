package com.didimdol.skt.kimjh.multirecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kimjh on 2016-02-25.
 */
public class NailTypeHolder extends RecyclerView.ViewHolder {
    TextView nailType;
    TextView nailPrice;

    public NailTypeHolder(View itemView) {
        super(itemView);
        nailType = (TextView)itemView.findViewById(R.id.text_nailtype);
        nailPrice = (TextView)itemView.findViewById(R.id.text_price);
    }

    public void setNailType (NailTypeData data){
        nailType.setText(data.nailType);
        nailPrice.setText(""+data.nailPrice);
    }
}
