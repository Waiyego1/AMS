package com.example.himanshu.ams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button nextact= (Button)findViewById(R.id.button3);
        nextact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this , secondActivity.class );
                    startActivity(intent);
            }
        });

            Button frtec =(Button) findViewById(R.id.button2);
            frtec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent frintent= new Intent(FirstActivity.this ,teacheractivity.class);
                    startActivity(frintent);
                }
            });

            Button forpar =(Button)findViewById(R.id.button1);
            forpar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent parintent=new Intent(FirstActivity.this , parentactivity.class
                    );
                    startActivity(parintent);
                }
            });
    }

        }