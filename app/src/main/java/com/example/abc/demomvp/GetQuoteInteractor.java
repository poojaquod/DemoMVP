package com.example.abc.demomvp;

//Declare interfase here by pooja kamate
public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onfinished(String name);
        }

    void getNextQuote(OnFinishedListener listener);
}
