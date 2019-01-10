package com.example.abc.demomvp.Demo3.Presenter;

import com.example.abc.demomvp.Demo3.mvp.FragmentOneVP;

public class Frg_twoPresenter implements FragmentOneVP.Presenter {
    FragmentOneVP.View view;


    public Frg_twoPresenter(FragmentOneVP.View view) {
        this.view = view;
    }

    @Override
    public void getText() {
        view.setText("Text form Presenter Two");
    }
}
