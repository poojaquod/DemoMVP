package com.example.abc.demomvp.Demo3.Presenter;

import com.example.abc.demomvp.Demo3.Fragment.BaseFragment;
import com.example.abc.demomvp.Demo3.Fragment.FragmentOne;
import com.example.abc.demomvp.Demo3.Fragment.FragmentTwo;
import com.example.abc.demomvp.Demo3.mvp.FragmentNavigation;
import com.example.abc.demomvp.Demo3.mvp.DemoActivity3VP;

import java.util.Random;

public class DemoActivity3Presenter implements DemoActivity3VP.Presenter,FragmentNavigation.Presenter {
   DemoActivity3VP.View view;

    public DemoActivity3Presenter(DemoActivity3VP.View view) {
        this.view = view;
    }

    @Override
    public void getRandomFragment() {
        if(new Random().nextBoolean())
        {
            view.setFragment(new FragmentOne());

        }
        else {
            view.setFragment(new FragmentTwo());
        }
    }

    @Override
    public void addFragment(BaseFragment fragment) {
        view.setFragment(fragment);
    }
}
