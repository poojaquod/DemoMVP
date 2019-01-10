package com.example.abc.demomvp.Demo3.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abc.demomvp.Demo3.mvp.FragmentNavigation;

public abstract class BaseFragment extends Fragment implements FragmentNavigation.View {

    protected FragmentNavigation.Presenter navigationpresenter;
    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        rootView = inflater.inflate(getLayout(), container, false);
        return rootView;
    }

    @Override
    public void attachPresenter(FragmentNavigation.Presenter presenter) {
        navigationpresenter=presenter;

    }
      protected abstract int getLayout();

}
