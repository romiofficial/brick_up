package com.namankhurpia.brick_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PastExperience extends AppCompatActivity {
ImageView past;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_experience);
        past = (ImageView)findViewById(R.id.past);

        past.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PastExperience.this,Profile.class);
                startActivity(i);
            }
        });
    }
}
