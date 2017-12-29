package com.appublisher.shopping.common.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.appublisher.shopping.R;
import com.appublisher.shopping.base.activity.BaseActivity;

public class MainActivity extends BaseActivity {

    private RadioGroup mRgp;

    @Override
    protected void initView() {
        mRgp = findViewById(R.id.radioGroup);
        mRgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

}
