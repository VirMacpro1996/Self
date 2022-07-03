package com.vir.self;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button getstartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getstartBtn = findViewById(R.id.getStarted);


        getstartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // we go to LoginActivity
                startActivity(new Intent(MainActivity.this,LoginActivity.class));

            }
        });
    }
}