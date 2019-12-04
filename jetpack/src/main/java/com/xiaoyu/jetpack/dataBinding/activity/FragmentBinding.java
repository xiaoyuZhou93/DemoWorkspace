package com.xiaoyu.jetpack.dataBinding.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaoyu.jetpack.R;
import com.xiaoyu.jetpack.dataBinding.bean.Bean1;
import com.xiaoyu.jetpack.databinding.Activity1LayoutBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class FragmentBinding extends androidx.fragment.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Activity1LayoutBinding inflate = DataBindingUtil.inflate(inflater, R.layout.activity1_layout, container, false);
//        inflate.setBean(new Bean1("apple",2,20));
//        return inflate.getRoot();
        return null;

    }
}
