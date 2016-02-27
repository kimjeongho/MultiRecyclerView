package com.didimdol.skt.kimjh.multirecyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimjh on 2016-02-25.
 */
public class DetailArtistData {
//    String artistImage;
    /*public static final int TYPE_DETAIL_ARTIST = 0;
    public static final int TYPE_NAILTYPE = 1;
    public static final int TYPE_COMMENTTITLE = 2;
    public static final int TYPE_COMMENT = 3;
    public static final int TYPE_MORE = 4;*/

    int artistImage;
    String artistName;
    String shopName;
    String artistContent;
    List<NailTypeData> nailType = new ArrayList<NailTypeData>();
    List<CommentData> comment = new ArrayList<CommentData>();

    int total;

}
