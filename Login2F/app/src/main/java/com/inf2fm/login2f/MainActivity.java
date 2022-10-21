package com.inf2fm.login2f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    private void executeNextActivity(){
        startActivity(new Intent(MainActivity.this, StartActivity.class));

    }


    public class ClickButton implements View

            .OnClickListener{
        @Override
        public void onClick(View view) {
            executeNextActivity();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button_login);
        mButton.setOnClickListener(new ClickButton());


    }
}