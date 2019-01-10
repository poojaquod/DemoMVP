package com.example.abc.demomvp.Demo3.mvp;


import com.example.abc.demomvp.Demo3.Fragment.BaseFragment;

/**
 * Created by dsdmsa on 4/8/17.
 */

public interface FragmentNavigation {
    interface View {
        void attachPresenter(Presenter presenter);

    }

    interface Presenter {
        void addFragment(BaseFragment fragment);
    }
}
