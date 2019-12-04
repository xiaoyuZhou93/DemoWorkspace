package com.xiaoyu.jetpack.dataBinding.activity;

import android.os.Bundle;

import com.xiaoyu.jetpack.R;
import com.xiaoyu.jetpack.dataBinding.bean.Bean1;
import com.xiaoyu.jetpack.databinding.Activity1LayoutBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/***
 *  简单使用
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity1LayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.activity1_layout);
        binding.setBean(new Bean1("apple", 1, 10));
    }
}
