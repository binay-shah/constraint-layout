package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    List<TextView> listOfTextViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfTextViews = new ArrayList<>();
        listOfTextViews.add(findViewById(R.id.box1_text));
        listOfTextViews.add(findViewById(R.id.box2_text));
        listOfTextViews.add(findViewById(R.id.box3_text));
        listOfTextViews.add(findViewById(R.id.box4_text));
        listOfTextViews.add(findViewById(R.id.box5_text));

        for (TextView box : listOfTextViews){
            box.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.box1_text){
            v.setBackgroundColor(getResources().getColor(R.color.my_red));
        }else if(v.getId() == R.id.box2_text){
            v.setBackgroundColor(getResources().getColor(R.color.my_green));
        }
    }
}