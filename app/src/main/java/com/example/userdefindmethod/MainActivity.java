package com.example.userdefindmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        makeToast();
        makealert();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makeToast();
                makealert();

            }
        });

    }


    //.........................................................//


    private void makeToast() {
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }

    private void makealert() {

        new AlertDialog.Builder(MainActivity.this)
        .setTitle("this is a title")
        .setMessage("hello")
                .show();

    }
}