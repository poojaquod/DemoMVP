package com.example.abc.demomvp.Demo3.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.abc.demomvp.Demo3.Fragment.BaseFragment;
import com.example.abc.demomvp.Demo3.Presenter.DemoActivity3Presenter;
import com.example.abc.demomvp.Demo3.mvp.DemoActivity3VP;
import com.example.abc.demomvp.R;

public class DemoActivity3 extends AppCompatActivity implements DemoActivity3VP.View {

    DemoActivity3Presenter demoActivity3Presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        demoActivity3Presenter=new DemoActivity3Presenter(this);
        demoActivity3Presenter.getRandomFragment();


    }

    @Override
    public void setFragment(BaseFragment fragment) {

        //ataching to fragment the navigation presenter
        fragment.attachPresenter(demoActivity3Presenter);
        //showing the presenter on screen
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .commit();
    }
}
