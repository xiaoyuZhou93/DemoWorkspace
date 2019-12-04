package com.xiaoyu.jetpack.dataBinding.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

/***
 * 单向数据绑定bean
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class Bean3  {
  private ObservableField<String> name;
  private ObservableField<Integer> price;
  private ObservableField<Integer> total;

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<Integer> getPrice() {
        return price;
    }

    public void setPrice(ObservableField<Integer> price) {
        this.price = price;
    }

    public ObservableField<Integer> getTotal() {
        return total;
    }

    public void setTotal(ObservableField<Integer> total) {
        this.total = total;
    }
}
