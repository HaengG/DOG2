package com.example.dog2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, DogListener {

    private TextView mTVSound;
    private Bulldog b = new Bulldog();
    private Poodle p = new Poodle();
    private Sleddog s = new Sleddog();
    private Button mBtnPoodle, mBtnBulldog, mBtnSleddog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();
    }

    private void initGUI()
    {
        mBtnPoodle = (Button)findViewById(R.id.btn_poodle);
        mBtnBulldog = (Button)findViewById(R.id.btn_bulldog);
        mBtnSleddog = (Button)findViewById(R.id.btn_sleddog);
        mTVSound = (TextView)findViewById(R.id.tv_sound);

        b.onDogListener(this);
        p.onDogListener(this);
        s.onDogListener(this);
        mBtnSleddog.setOnClickListener(this);
        mBtnBulldog.setOnClickListener(this);
        mBtnPoodle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_bulldog :
                b.bark();
                break;
            case R.id.btn_poodle :
                p.bark();
                break;
            case R.id.btn_sleddog :
                s.bark();
                break;
            default :
                break;
        }
    }

    @Override
    public void onBark(String sound) {
        mTVSound.setText(sound);
    }
}
