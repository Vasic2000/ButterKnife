package ru.vasic2000.my2;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public void btnOneClick() {
        getViewState().showLoading();
        getViewState().btn1Click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getViewState().hideLoading();
    }
    public void btnTwoClick() {
        getViewState().showLoading();
        getViewState().btn2Click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getViewState().hideLoading();
    }
    public void btnThreeClick() {
        getViewState().showLoading();
        getViewState().btn3Click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getViewState().hideLoading();
    }

}
