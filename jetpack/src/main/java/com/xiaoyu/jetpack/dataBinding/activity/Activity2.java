package com.xiaoyu.jetpack.dataBinding.activity;

import android.os.Bundle;
import android.view.View;

import com.xiaoyu.jetpack.R;
import com.xiaoyu.jetpack.dataBinding.bean.Bean2;
import com.xiaoyu.jetpack.dataBinding.bean.Bean3;
import com.xiaoyu.jetpack.databinding.Activity2LayoutBinding;
import com.xiaoyu.jetpack.databinding.Activity3LayoutBinding;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/***
 *  单向数据绑定
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class Activity2 extends AppCompatActivity {

    private Bean2 bean2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity2LayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.activity2_layout);
        bean2 = new Bean2("apple", 1, 1);
        binding.setBean(bean2);

//        binding.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
//            @Override
//            public void onPropertyChanged(Observable sender, int propertyId) {
//              todo 这里可以区别出不同的fileid
//            }
//        });

    }

    public void change1(View view) {
        bean2.setName("apple" + new Random().nextInt(10));
        bean2.setTotal(new Random().nextInt(100));

    }

    public void change2(View view) {
        bean2.setPrice(new Random().nextInt(10));
        bean2.setTotal(new Random().nextInt(100));
    }

}
