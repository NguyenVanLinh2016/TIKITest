package com.linhnv.tikitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.linhnv.tikitest.adapter.KeywordAdapter;
import com.linhnv.tikitest.model.Keyword;
import com.linhnv.tikitest.utils.AppUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private List<Keyword> keywordList = new ArrayList<>();
    private KeywordAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAdapter = new KeywordAdapter(keywordList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareKeyWordData();
    }

    private void prepareKeyWordData(){
        String [] list = {
                "xiaomi",
                "bitis hunter",
                "bts",
                "balo",
                "bitis hunter x",
                "tai nghe",
                "harry potter",
                "anker",
                "iphone",
                "balo nữ",
                "nguyễn nhật ánh",
                "đắc nhân tâm",
                "ipad",
                "senka",
                "tai nghe bluetooth",
                "son",
                "maybelline",
                "laneige",
                "kem chống nắng",
                "anh chính là thanh xuân của em"};
        for (int i=0; i<list.length; i++){
            Keyword keyword = new Keyword(list[i], AppUtils.getRandomColor());
            keywordList.add(keyword);
        }
    }
}
