package com.xiaoyu.jetpack.dataBinding.bean;

import com.xiaoyu.jetpack.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/***
 * 单向数据绑定bean
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class Bean2 extends BaseObservable {
    //如果是public在成员变量上注解
    @Bindable
    public String name;
    private int price;
    public int total;

    public Bean2(String name, int price, int total) {
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.xiaoyu.jetpack.BR.name);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyChange();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
