package com.example.abc.demomvp.Demo3.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.abc.demomvp.Demo3.Presenter.Frg_onePresenter;
import com.example.abc.demomvp.Demo3.mvp.FragmentOneVP;
import com.example.abc.demomvp.R;

public class FragmentOne extends BaseFragment implements FragmentOneVP.View{

    FragmentOneVP.Presenter presenter;
    private TextView textView;
    private Button button;
    @Override
    protected int getLayout() {
        return R.layout.fragment_layout;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
           presenter = new Frg_onePresenter(this);
        textView = (TextView) rootView.findViewById(R.id.tv_text);
        button = (Button) rootView.findViewById(R.id.btn_interact);

         presenter.getText();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationpresenter.addFragment(new FragmentTwo());
            }
        });
    }

    @Override
    public void setText(String str) {
        textView.setText(str);
    }
}
