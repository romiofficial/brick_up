package com.namankhurpia.brick_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class HomeScreen extends AppCompatActivity {
ImageView open,close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        open = (ImageView)findViewById(R.id.open);
        close = (ImageView)findViewById(R.id.close);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this, Relax.class);
                startActivity(i);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(HomeScreen.this,Close.class);
                startActivity(i);
            }
        });
    }
}
