package com.xiaoyu.jetpack.dataBinding.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;

import com.xiaoyu.jetpack.R;
import com.xiaoyu.jetpack.dataBinding.bean.Bean5;
import com.xiaoyu.jetpack.databinding.Activity5LayoutBinding;
import com.xiaoyu.jetpack.databinding.StubLayoutBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/***
 *  include 和 viewStub(懒加载)
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/6 0006
 *
 */
public class Activity5 extends AppCompatActivity {


    private static final String TAG = "ACTIVITY_5";
    private Activity5LayoutBinding binding;
    private Bean5 bean5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity5_layout);
        bean5 = new Bean5();
        bean5.setName("小明");
        binding.setBean(bean5);
        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                //如果在 xml 中没有对 viewStub 进行数据绑定在此处绑定
                // 如要更改数据必须是绑定的bean不可重新创建绑定
                StubLayoutBinding binding2 = DataBindingUtil.bind(inflated);
                Bean5 bean51 = new Bean5();
                bean51.setName("小牧");
                binding2.setBean(bean51);
            }
        });



    }


    public void showLayout(View view){
        if (!binding.viewStub.isInflated()) { //只能被inflate一次
            binding.viewStub.getViewStub().inflate();
        }
    }
}
