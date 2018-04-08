package com.example.android.learngithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FirstCommit(){
        //Initial commit
    }

    public void SecondCommit(){
        //Here is second commit

        int i = 0;
        i = i + 1;
    }
}
