package com.example.abc.demomvp.Demo3.mvp;


import com.example.abc.demomvp.Demo3.Fragment.BaseFragment;

public interface DemoActivity3VP {
    interface View{
        void setFragment(BaseFragment fragment);
    }

    interface Presenter{
        void getRandomFragment();
    }
}
