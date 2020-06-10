package com.example.pesonacandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sign_in(View view)
    {
        Intent intent = new Intent (MainActivity.this, menu.class);
        startActivity(intent);
    }

    public void sign_up(View view)
    {
        Intent intent = new Intent (MainActivity.this, sign_up.class);
        startActivity(intent);
    }
}
