package com.xiaoyu.jetpack.navigation.activity;

import android.os.Bundle;

import com.xiaoyu.jetpack.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/11/29 0029
 *
 */
public class NavigationDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
//        initView();

    }

    private void initView() {
        NavHostFragment navHost = NavHostFragment.create(R.navigation.navigation_file);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.my_framelayout, navHost)
                .setPrimaryNavigationFragment(navHost) // this is the equivalent to app:defaultNavHost="true"
                .commit();
    }
}
