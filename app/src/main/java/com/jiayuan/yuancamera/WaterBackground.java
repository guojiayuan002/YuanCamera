package com.jiayuan.yuancamera;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by ${GuoJiayuan} on 2017/11/1.
 */

public class WaterBackground extends RelativeLayout {
    private final TextView mTvTime, mTvName;

    private String mTime, mName, mColor;

    public WaterBackground(Context context) {
        this(context, null);
    }

    public WaterBackground(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_water_background, this, true);
        mTvName = (TextView) findViewById(R.id.tv_water_name);
        mTvTime = (TextView) findViewById(R.id.tv_water_time);


    }

    /**
     * 设置文字内容
     */
    public void setTextContent(String time, String name, String color) {
//        mTime = time;
//        mName = name;
//        mColor = color;

        mTvName.setText(name);
        mTvTime.setText(time);
        mTvName.setTextColor(Color.parseColor(color));
        mTvTime.setTextColor(Color.parseColor(color));

    }
}
