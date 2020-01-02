package ru.vasic2000.my2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {
    @InjectPresenter
    MainPresenter presenter;

    @BindView(R.id.btnCounter1)
    Button button1;
    @BindView(R.id.btnCounter2)
    Button button2;
    @BindView(R.id.btnCounter3)
    Button button3;

    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.tv3)
    TextView tv3;

    @BindView(R.id.progressBar)
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @ProvidePresenter
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @OnClick(R.id.btnCounter1)
    public void buttonOneClick() {
        presenter.btnOneClick();
    }
    @OnClick(R.id.btnCounter2)
    public void buttonTwoClick() {
        presenter.btnTwoClick();
    }
    @OnClick(R.id.btnCounter3)
    public void buttonThreeClick() {
        presenter.btnThreeClick();
    }

    @Override
    public void btn1Click() {
        button1.setText("Crash 1!!!");
    }
    @Override
    public void btn2Click() {
        button2.setText("Crash 2!!!");
    }
    @Override
    public void btn3Click() {
        button3.setText("Crash 3!!!");
    }

    @Override
    public void showLoading() {
        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);
        tv1.setVisibility(View.GONE);
        tv2.setVisibility(View.GONE);
        tv3.setVisibility(View.GONE);
        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv3.setVisibility(View.VISIBLE);
        pb.setVisibility(View.GONE);
    }
}
