package com.example.abc.demomvp;

public class MainPresenterImpl implements GetQuoteInteractor.OnFinishedListener,MainPresenter {

    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImpl(MainView mainView, GetQuoteInteractor getQuoteInteractor) {
        this.mainView = mainView;
        this.getQuoteInteractor = getQuoteInteractor;
    }

    @Override
    public void onfinished(String name) {
        if(mainView != null)
        {
            mainView.setQuote(name);
            mainView.hideProgress();
        }

    }

    @Override
    public void onButtonClick() {
        if(mainView != null)
        {
            mainView.showProgress();
        }
        getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView=null;

    }
}
