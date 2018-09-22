package com.linhnv.tikitest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.linhnv.tikitest.R;
import com.linhnv.tikitest.model.Keyword;

import java.util.List;

/**
 * Created by linhnv on 22/09/2018.
 */

public class KeywordAdapter extends RecyclerView.Adapter<KeywordViewHolder> {

    private List<Keyword> keywordList;

    public KeywordAdapter(List<Keyword> keywordList){
        this.keywordList = keywordList;
    }

    @Override
    public KeywordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemview_keyword, parent, false);
        return new KeywordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(KeywordViewHolder vHolder, int position) {
        Keyword data = getItem(position);
        vHolder.bindData(data);
    }

    @Override
    public int getItemCount() {
        return keywordList.size();
    }

    public Keyword getItem(int position) {
        return keywordList.get(position);
    }
}
