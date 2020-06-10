package com.example.pesonacandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class picture2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture2);
    }

    public void menu(View view) {
        Intent i = new Intent(picture2.this, menu.class);
        startActivity(i);
    }
}
