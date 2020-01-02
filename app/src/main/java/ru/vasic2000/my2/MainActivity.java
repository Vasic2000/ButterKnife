package ru.vasic2000.my2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
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

    @OnClick(R.id.btnCounter1)
    public void buttonOneClick() {
        showLoading();
        button1.setText("Crash 1!!!");
        hideLoading();
    }

    @OnClick(R.id.btnCounter2)
    public void buttonTwoClick() {
        showLoading();
        button2.setText("Crash 2!!!");
        hideLoading();
    }
    @OnClick(R.id.btnCounter3)
    public void buttonThreeClick() {
        showLoading();
        button3.setText("Crash 3!!!");
        hideLoading();
    }

    private void showLoading() {
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        pb.setVisibility(View.VISIBLE);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void hideLoading() {
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv3.setVisibility(View.VISIBLE);
        pb.setVisibility(View.INVISIBLE);
    }
}
