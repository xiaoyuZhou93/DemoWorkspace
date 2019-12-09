package com.xiaoyu.jetpack.dataBinding.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaoyu.jetpack.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class DataBindingHomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_databindhome);
    }

    public void startActivity(View view) {
        startActivity(new Intent(this, Activity1.class));
    }

    public void startActivity2(View view) {
        startActivity(new Intent(this, Activity2.class));
    }

    public void startActivity3(View view) {
        startActivity(new Intent(this, Activity3.class));
    }
    public void startActivity4(View view) {
        startActivity(new Intent(this, Activity4.class));
    }
    public void startActivity5(View view) {
        startActivity(new Intent(this, Activity5.class));
    }
}
