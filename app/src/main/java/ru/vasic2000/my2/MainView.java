package ru.vasic2000.my2;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;

@StateStrategyType(value = AddToEndSingleStrategy.class)
public interface MainView extends MvpView {
    void btn1Click();

    void btn2Click();

    void btn3Click();

    void showLoading();

   void hideLoading();
}
