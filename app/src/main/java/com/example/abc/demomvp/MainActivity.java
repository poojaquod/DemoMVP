package com.example.abc.demomvp;

import android.content.Context;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.abc.demomvp.Demo1.DemoActivity1;
import com.example.abc.demomvp.Demo2.View.DemoActivity2;
import com.example.abc.demomvp.Demo3.Activity.DemoActivity3;

public class MainActivity extends AppCompatActivity {
    Context context=MainActivity.this;
    FunctionPresenter functionPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        functionPresenter=new FunctionPresenterImpl();
    }

    public void Demo1(View view) {
        functionPresenter.onButtonClick(context,DemoActivity1.class);
    }

    public void Demo2(View view) {
        functionPresenter.onButtonClick(context,DemoActivity2.class);
    }

    public void Demo3(View view) {
        functionPresenter.onButtonClick(context,DemoActivity3.class);
    }
}
