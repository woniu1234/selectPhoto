package com.common.photo.models.ad;

import android.view.View;

/**
 * 广告实体
 */
public class AdEntity {
    public View adView;
    public int lineIndex;

    public AdEntity(View adView, int lineIndex) {
        this.adView = adView;
        this.lineIndex = lineIndex;
    }
}
