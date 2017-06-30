package com.cdemo.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void basicSampleClick(View v){
        startActivity(new Intent(MainActivity.this, BasicSample.class));
    }

    public void includeLayoutClick(View v){
        startActivity(new Intent(MainActivity.this, IncludeLayout.class));
    }

    public void collectionClick(View v){
        startActivity(new Intent(MainActivity.this, CollectionLayout.class));
    }
}
