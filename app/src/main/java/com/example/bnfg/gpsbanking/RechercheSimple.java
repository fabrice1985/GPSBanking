package com.example.bnfg.gpsbanking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by BNFG on 17/07/2017.
 */

public class RechercheSimple extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton6;
    public final static String id= "identifiant";
   // Choice choice = new Choice();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recherchesimple);
        mButton1 = (Button) findViewById(R.id.btnagence1);
        mButton2 = (Button) findViewById(R.id.btngab1);
        mButton3 = (Button) findViewById(R.id.btntpe1);
        mButton4 = (Button) findViewById(R.id.btnflash1);
        mButton6 = (Button) findViewById(R.id.btnmoneygram1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent = new Intent(RechercheSimple.this, Regions.class);
                //choice.getIdagence();
                intent.putExtra(id, 1);
                startActivity(intent);
                // }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent1 = new Intent(RechercheSimple.this, Regions.class);
                //choice.getIdgab();
                intent1.putExtra(id, 2);
                startActivity(intent1);
                // }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent = new Intent(RechercheSimple.this, Regions.class);
                //choice.getIdagence();
                intent.putExtra(id, 3);
                startActivity(intent);
                // }
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent1 = new Intent(RechercheSimple.this, Regions.class);
                //choice.getIdgab();
                intent1.putExtra(id, 4);
                startActivity(intent1);
                // }
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent1 = new Intent(RechercheSimple.this, Regions.class);
                //choice.getIdgab();
                intent1.putExtra(id, 6);
                startActivity(intent1);
                // }
            }
        });
    }
}
