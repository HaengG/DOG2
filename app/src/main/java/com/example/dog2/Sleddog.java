package com.example.dog2;

import android.content.Context;

public class Sleddog extends Dog {

    public void bark(){
        super.strSound = "컹컹";
        super.bark();
    }
}
