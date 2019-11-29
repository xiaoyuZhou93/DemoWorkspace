package com.xiaoyu.scrooffset.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoyu.scrooffset.R;

import java.util.List;

import androidx.annotation.Nullable;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/11/29 0029
 *
 */
public class AdapterTwo extends BaseQuickAdapter<String, BaseViewHolder> {
    public AdapterTwo(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_text,   helper.getPosition() + "条目");


    }
}
