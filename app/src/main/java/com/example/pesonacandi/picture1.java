package com.example.pesonacandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class picture1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture1);
    }

    public void picture1(View view) {
        Intent i = new Intent(picture1.this, picture2.class);
        startActivity(i);
    }
}
