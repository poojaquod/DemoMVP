package com.example.abc.demomvp.Demo3.mvp;


public interface FragmentOneVP {
    interface View{
        void setText(String str);

    }

    interface Presenter{
        void getText();
    }
}
