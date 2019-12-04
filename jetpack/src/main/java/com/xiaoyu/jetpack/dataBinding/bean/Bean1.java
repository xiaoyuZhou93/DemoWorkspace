package com.xiaoyu.jetpack.dataBinding.bean;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/4 0004
 *
 */
public class Bean1 {
    public Bean1(String name, int count, int total) {
        this.name = name;
        this.count = count;
        this.total = total;
    }

    private String name;
    public int count;
    public int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
