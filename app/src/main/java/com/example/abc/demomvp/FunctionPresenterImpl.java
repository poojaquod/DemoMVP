package com.example.abc.demomvp;

import android.content.Context;
import android.content.Intent;


public class FunctionPresenterImpl implements FunctionPresenter{
    @Override
    public void onButtonClick(Context context, Class<?> to) {
        Intent intent = new Intent(context,to);
        context.startActivity(intent);
    }
}
