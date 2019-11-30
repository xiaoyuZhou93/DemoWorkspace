package com.xiaoyu.jetpack.navigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
public class FragmentTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.fragment_two, null);
        TextView tv_date = inflate.findViewById(R.id.tv_date);
        Bundle arguments = getArguments();
        tv_date.setText(arguments.getString("key"));



        inflate.findViewById(R.id.tv_intent2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTwoArgs data = new FragmentTwoArgs.Builder("这是第二种方式传递的数据").build();
                Navigation.findNavController(getView()).navigate(R.id.action_fragmentTwo2_to_fragmentThree2,data.toBundle());
            }
        });
        inflate.findViewById(R.id.tv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).popBackStack();
            }
        });


        return inflate;

    }
}
