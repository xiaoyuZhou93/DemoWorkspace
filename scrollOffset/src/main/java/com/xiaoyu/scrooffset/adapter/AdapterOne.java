package com.xiaoyu.scrooffset.adapter;

import android.util.Log;

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
public class AdapterOne extends BaseQuickAdapter<String, BaseViewHolder> {
    public AdapterOne(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        int position = helper.getPosition();
        Log.e(TAG, "convert:    "+  position+"" );
        switch (position % 3) {
            case 0:
                helper.setBackgroundRes(R.id.iv_bg,R.drawable.pic_one);
                break;
            case 1:
                helper.setBackgroundRes(R.id.iv_bg,R.drawable.pic_two);
                break;
            case 2:
                helper.setBackgroundRes(R.id.iv_bg,R.drawable.pic_three);
                break;

        }

    }
}
