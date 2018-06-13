package com.example.tesk7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView iv;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        iv=findViewById(R.id.iv);
    }

    public void click(View view) {
        x= (int) (Math.random()*3+1);
        if (x==1) {
            btn.setText("1");
            iv.setImageResource(R.drawable.mario);
        }
        else{
            if (x==2) {
                btn.setText("2");
                iv.setImageResource(R.drawable.domino);
            }
            else{
                if (x==3) {
                    btn.setText("3");
                    iv.setImageResource(R.drawable.cocacola);
                }
                }
            }
        }

    }

