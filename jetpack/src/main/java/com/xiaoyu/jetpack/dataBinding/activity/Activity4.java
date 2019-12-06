package com.xiaoyu.jetpack.dataBinding.activity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.xiaoyu.jetpack.R;
import com.xiaoyu.jetpack.dataBinding.bean.Bean4;
import com.xiaoyu.jetpack.databinding.Activity4LayoutBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/***
 *  绑定点击事件
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/12/5 0005
 *
 */
public class Activity4 extends AppCompatActivity {

    private Activity4LayoutBinding binding;
    private Bean4 bean4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity4_layout);
        bean4 = new Bean4();
        bean4.setName("小明");
        bean4.setPwd("123");
        binding.setBean(bean4);
        binding.setClick(new BindClick());

    }

    public class BindClick {

        public void testclick(View textView) {
            Toast.makeText(Activity4.this, ((TextView)textView).getText().toString(), Toast.LENGTH_SHORT).show();
        }

        public void ToastClick(Bean4 bean4) {
            Toast.makeText(Activity4.this, bean4.getName() + "", Toast.LENGTH_SHORT).show();
        }

        public void afterTextChanged(Editable s) {
            bean4.setName(s.toString());
            binding.setBean(bean4);
        }

        public void afterpwdChanged(Editable s) {
            bean4.setPwd(s.toString());
            binding.setBean(bean4);
        }
    }
}
