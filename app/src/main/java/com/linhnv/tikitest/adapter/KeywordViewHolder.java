package com.linhnv.tikitest.adapter;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.linhnv.tikitest.R;
import com.linhnv.tikitest.model.Keyword;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by linhnv on 22/09/2018.
 */

public class KeywordViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.view_root)
    View viewRoot;

    @BindView(R.id.text_view_keyword)
    TextView txtKeyword;

    public KeywordViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindData(Keyword data) {
        String text = breakLongLine(data.getKeyword().trim());
        txtKeyword.setText(text);
        GradientDrawable gradientDrawable = (GradientDrawable) viewRoot.getBackground();
        gradientDrawable.setColor(data.getColor());
    }

    private String breakLongLine(String line) {
        String[] wordArray = line.split(" ");
        String result = line;
        int wordCount = wordArray.length;

        if (wordCount > 1) {
            int breakIndex = wordCount / 2;
            int firstMarkIndex = markIndex(wordArray, 0, breakIndex);
            String subLine1 = line.substring(0, firstMarkIndex);
            String subLine2 = line.substring(firstMarkIndex, line.length());

            result = subLine1.concat("\n").concat(subLine2);
        }

        return result;
    }

    private int markIndex(String[] wordArray, int startIndex, int endIndex) {
        int mark = 0;
        int countdown = endIndex - 1;
        while (countdown >= startIndex) {
            mark += wordArray[countdown].length() + 1;
            countdown--;
        }

        return mark;
    }

}
