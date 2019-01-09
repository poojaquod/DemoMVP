package com.example.abc.demomvp;

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onfinished(String name);
        }

    void getNextQuote(OnFinishedListener listener);
}
