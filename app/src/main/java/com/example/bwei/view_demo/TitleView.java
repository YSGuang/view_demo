package com.example.bwei.view_demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by YU on 2017/7/10.
 */
public class TitleView extends RelativeLayout {
    //返回按钮控件
    private Button mLeft;
    private TextView title;
    public TitleView(Context context) {
        super(context);
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_bar, this);
        //获取控件
        mLeft=(Button)findViewById(R.id.left);
        title=(TextView)findViewById(R.id.title_tv);
    }
    //为左侧button添加监听事件
    public void setLeftButtonListener(OnClickListener listener) {
        mLeft.setOnClickListener(listener);
    }

    // 设置标题的方法
    public void setTitleText(String title1) {
        title.setText(title1);
    }
}
