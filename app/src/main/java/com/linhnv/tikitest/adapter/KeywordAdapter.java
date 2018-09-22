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
        //bind data

        Keyword data = getItem(position);
        vHolder.bindData(data, position);

        /*ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) vHolder.viewRoot.getLayoutParams();
        if (position == 0){
            marginParams.setMargins(ThemeUtils.dpToPx(vHolder.txtKeyword.getContext(), 12),
                    0,
                    ThemeUtils.dpToPx(vHolder.txtKeyword.getContext(), 6),
                    0);
        }
        if (position == keywordList.size()-1){
            marginParams.setMargins(ThemeUtils.dpToPx(vHolder.txtKeyword.getContext(), 6),
                    0,
                    ThemeUtils.dpToPx(vHolder.txtKeyword.getContext(), 12),
                    0);
        }*/

    }

    @Override
    public int getItemCount() {
        return keywordList.size();
    }

    public Keyword getItem(int position) {
        return keywordList.get(position);
    }
}
