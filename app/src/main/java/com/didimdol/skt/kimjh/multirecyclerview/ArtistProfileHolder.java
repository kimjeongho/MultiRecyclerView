package com.didimdol.skt.kimjh.multirecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kimjh on 2016-02-25.
 */
public class ArtistProfileHolder extends RecyclerView.ViewHolder {
    ImageView artistImageView;
    TextView artistNameView;
    TextView shopNameView;
    TextView artistContent;

    public ArtistProfileHolder(View itemView) {
        super(itemView);
        artistImageView = (ImageView)itemView.findViewById(R.id.image_artist);
        artistNameView = (TextView)itemView.findViewById(R.id.text_artist);
        shopNameView = (TextView)itemView.findViewById(R.id.text_shop);
        artistContent = (TextView)itemView.findViewById(R.id.text_content);
    }

    public void setArtistProfileItem(DetailArtistData data){
        artistImageView.setImageResource(data.artistImage);
        artistNameView.setText(data.artistName);
        shopNameView.setText(data.shopName);
        artistContent.setText(data.artistContent);
    }

}
