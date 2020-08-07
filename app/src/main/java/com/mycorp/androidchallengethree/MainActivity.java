package com.mycorp.androidchallengethree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mycorp.androidchallengethree.musicplayer.MusicActivity;
import com.mycorp.androidchallengethree.register.RegisterActivity;
import com.mycorp.androidchallengethree.shoppinglist.ShoppingActivity;

public class MainActivity extends AppCompatActivity {

    Button btnRegister, btnList, btnMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = findViewById(R.id.btnRegistrasi);
        btnList = findViewById(R.id.btnList);
        btnMusic = findViewById(R.id.btnMusic);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShoppingActivity.class);
                startActivity(intent);
            }
        });

        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MusicActivity.class);
                startActivity(intent);
            }
        });
    }
}