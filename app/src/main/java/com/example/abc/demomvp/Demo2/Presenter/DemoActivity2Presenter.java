package com.example.abc.demomvp.Demo2.Presenter;

import com.example.abc.demomvp.Demo2.Model.User;

public class DemoActivity2Presenter {
  private User user;
  private View view;

    public DemoActivity2Presenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updatefullname(String name)
    {
        user.setName(name);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateemail(String email)
    {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

   public interface View{
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
