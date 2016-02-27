package com.didimdol.skt.kimjh.multirecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DetailArtistAdapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    EditText inputView;

    final static String[] NAILTYPE= {"A타입","B타입","C타입","젤네일"};

    final static int[] NAILPRICE = {25000,35000,40000,10000};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new DetailArtistAdapter();
        recyclerView.setAdapter(mAdapter);
        inputView = (EditText)findViewById(R.id.edit_message);

        Button btn = (Button)findViewById(R.id.btn_ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputView.getText().toString();
                if(!TextUtils.isEmpty(text)){
                    recyclerView.smoothScrollToPosition(mAdapter.getItemCount()-1);
                }
            }
        });

       initData();
    }

    private void initData() {
        DetailArtistData da = new DetailArtistData();   //artistprofile
        da.artistImage = R.mipmap.ic_launcher;
        da.artistName = "test";
        da.shopName = "shoptest";
        da.artistContent = "content Test";
        da.nailType = new ArrayList<NailTypeData>();
        for(int i=0; i<NAILTYPE.length ;i++){
        NailTypeData nd = new NailTypeData();   // nail type
        nd.nailPrice = Integer.parseInt(""+NAILPRICE[i]);
        nd.nailType = NAILTYPE[i];
        da.nailType.add(nd);}
        da.comment = new ArrayList<CommentData>();
        CommentData cd = new CommentData();     //comment type
        cd.userId = "가나다";
        cd.userComment = "댓글 테스트";
        da.comment.add(cd);
        mAdapter.put(da);

    }


}
