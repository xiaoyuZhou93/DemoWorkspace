package com.xiaoyu.scrooffset;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xiaoyu.scrooffset.adapter.AdapterOne;
import com.xiaoyu.scrooffset.adapter.AdapterTwo;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginException;

/**
 * 滑动偏移错位
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recy1;
    private RecyclerView recy2;
    private AdapterOne adapterOne;
    private AdapterTwo adapterTwo;
    private List list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy1 = findViewById(R.id.recy1);
        recy2 = findViewById(R.id.recy2);
        initview();
        listener();
    }

    private void listener() {
        recy2.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                recy1.scrollBy((int) (dx* 0.5), (int) (dy*0.5));
            }
        });
    }

    private void initview() {
        list = new ArrayList();
        list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");   list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");   list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");list.add("");
        recy1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        AdapterOne adapterOne = new AdapterOne(R.layout.layout_one, list);
        recy1.setAdapter(adapterOne);
        recy1.setOnTouchListener(myTouchListener);
        recy2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapterTwo = new AdapterTwo(R.layout.layout_two, list);
        adapterTwo.setEnableLoadMore(true);
        recy2.setAdapter(adapterTwo);


    }

private View.OnTouchListener myTouchListener = new View.OnTouchListener() {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
};
}
