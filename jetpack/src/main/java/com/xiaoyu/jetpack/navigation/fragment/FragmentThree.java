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
public class FragmentThree extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.fragment_three, null);
        TextView tv_data2 = inflate.findViewById(R.id.tv_data2);
        String stringData = FragmentTwoArgs.fromBundle(getArguments()).getStringData();
        tv_data2.setText(stringData);
        inflate.findViewById(R.id.tv_intent3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).popBackStack();
//                Navigation.findNavController(getView()).navigate(R.id.action_fragmentThree2_to_fragmentOne2);
            }
        });
        return inflate;

    }
}
