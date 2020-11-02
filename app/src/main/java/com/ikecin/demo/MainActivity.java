package com.ikecin.demo;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tencentConnect.R;
import com.tencent.tauth.Tencent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ok).setOnClickListener(v -> {
            Tencent mTencent = Tencent.createInstance("1104677783", getApplicationContext());
            Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();
        });
    }

}
