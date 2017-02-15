package com.example.root.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
 * 问题列表：
 * 1.TextView
 *  1.1 setText(null)
 *
 * 2.switch自定义背景track和前景thumb,实现switch样式的定制
 * 定义方式:
 * <Switch
        android:thumb="@drawable/pic_slide"
        android:track="@drawable/selector_switch_track_orange"
        ..../>
   选择器设置具体见selector_switch_track_orange.xml


 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.1 setText(null) 可以set null，和给空字符串“”一样
        TextView tvNull = (TextView) findViewById(R.id.tvNull);
        tvNull.setText(null);

    }
}
