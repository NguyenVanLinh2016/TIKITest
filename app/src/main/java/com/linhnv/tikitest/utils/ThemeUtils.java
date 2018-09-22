package com.linhnv.tikitest.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by linhnv on 22/09/2018.
 */

public class ThemeUtils {
    public static int dpToPx(Context context, int dp) {
        return (int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics()) + 0.5f);
    }
}
