package com.fedukova.studentmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.WindowFeature;

@Fullscreen
@EActivity(R.layout.activity_personal)
@WindowFeature(Window.FEATURE_NO_TITLE)
public class PersonalActivity extends AppCompatActivity {

    @AfterViews
    public void init(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }
}
