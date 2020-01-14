package com.example.dog2;

import android.content.Context;

public class Poodle extends Dog {

    public void bark(){
        super.strSound = "왈왈";
        super.bark();
    }
}
