package com.ikecin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.ikecin.demo.databinding.ActivityMainBinding;
import com.tencent.tauth.Tencent;

public class MainActivity extends Activity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.ok.setOnClickListener(v -> {
            Tencent mTencent = Tencent.createInstance("1104677783", getApplicationContext());
            Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();
        });
    }
}
