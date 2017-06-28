package com.cdemo.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cdemo.databindingsample.databinding.MainactivityFBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainactivityFBinding fBinding = DataBindingUtil.setContentView(this, R.layout.mainactivity_f);
        User user = new User();
        user.setFirstName("xq");
        user.setLastName("do well");
        fBinding.setUser(user);
    }
}
