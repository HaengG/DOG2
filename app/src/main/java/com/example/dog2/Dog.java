package com.example.dog2;

import android.content.Context;
import android.view.View;

public class Dog {
    private int x = 0, y = 0;
    protected String strSound = "멍멍";
    private DogListener dogListener = null;

    public void move(int hori, int verti){
        this.x = hori;
        this.y = verti;
    }

    public void bark(){
        dogListener.onBark(strSound);
    }

    public void run(){

    }

    public void onDogListener(DogListener listener){
        this.dogListener = listener;
    }

}
