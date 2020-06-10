package com.example.pesonacandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void history(View view)
    {
        Intent history = new Intent (menu.this, History.class);
        startActivity(history);
    }

    public void picture(View view)
    {
        Intent picture = new Intent(menu.this, picture.class);
        startActivity(picture);
    }

    public void quiz(View view)
    {
        Intent quiz = new Intent(menu.this, Quiz.class);
        startActivity(quiz);
    }

}
