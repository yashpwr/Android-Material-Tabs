package com.codedecode.androidmaterialtabs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.codedecode.androidmaterialtabs.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSimpleTabs = findViewById(R.id.btnSimpleTabs);
        Button btnScrollableTabs = findViewById(R.id.btnScrollableTabs);
        Button btnIconTextTabs = findViewById(R.id.btnIconTextTabs);
        Button btnIconTabs = findViewById(R.id.btnIconTabs);
        Button btnCustomIconTextTabs = findViewById(R.id.btnCustomIconTabs);

        btnSimpleTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTextTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSimpleTabs:
                startActivity(new Intent(MainActivity.this, SimpleTabsActivity.class));
                break;
            case R.id.btnScrollableTabs:
                startActivity(new Intent(MainActivity.this, ScrollableTabsActivity.class));
                break;
            case R.id.btnIconTextTabs:
                startActivity(new Intent(MainActivity.this, IconTextTabsActivity.class));
                break;
            case R.id.btnIconTabs:
                startActivity(new Intent(MainActivity.this, IconTabsActivity.class));
                break;
            case R.id.btnCustomIconTabs:
                startActivity(new Intent(MainActivity.this, CustomViewIconTextTabsActivity.class));
                break;
        }
    }
}
