package com.xiaoyu.jetpack.dataBinding.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xiaoyu.jetpack.R;
import com.xiaoyu.jetpack.dataBinding.bean.Bean2;
import com.xiaoyu.jetpack.dataBinding.bean.Bean3;
import com.xiaoyu.jetpack.databinding.Activity2LayoutBinding;
import com.xiaoyu.jetpack.databinding.Activity3LayoutBinding;

import java.util.Random;

import javax.security.auth.login.LoginException;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;

/***
 *  单向数据绑定
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class Activity3 extends AppCompatActivity {

    private Bean3 bean3;
    private Activity3LayoutBinding binding3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding3 = DataBindingUtil.setContentView(this, R.layout.activity3_layout);
        bean3 = new Bean3();
        bean3.setName(new ObservableField<String>("apple"));
        bean3.setPrice(new ObservableField<Integer>(10));
        bean3.setTotal(new ObservableField<Integer>(100));
        binding3.setBean(bean3);


    }


    public void change3(View view) {
        bean3.getName().set(new Random().nextInt(10) + "");
        bean3.getPrice().set(new Random().nextInt(30));
        bean3.getTotal().set(new Random().nextInt(100));
    }

}
