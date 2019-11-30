package com.xiaoyu.jetpack.navigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaoyu.jetpack.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/11/29 0029
 *
 */
public class FragmentOne extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.fragment_one, null);
        final Bundle bundle = new Bundle();
        bundle.putString("key","我是第一种方式传递的数据");
        inflate.findViewById(R.id.tv_intent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_fragmentOne2_to_fragmentTwo2,bundle);//navigation里的action的id
            }
        });
        return inflate;

    }
}
