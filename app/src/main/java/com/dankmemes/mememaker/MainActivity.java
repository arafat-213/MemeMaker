package com.dankmemes.mememaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.TopFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // It is called by TopFragment when user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomFragment bottomFragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        bottomFragment.setMemeText(top,bottom);
    }
}
