package com.example.bnfg.gpsbanking;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openapp);
        mButton1 = (Button) findViewById(R.id.btnconsulter);
        mButton2 = (Button) findViewById(R.id.btnrecherchesimple);
        mButton3 = (Button) findViewById(R.id.btnrecherchegeo);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent = new Intent(Main.this, Consultation.class);
                startActivity(intent);
                // }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if(view==mButton) {
                Intent intent1 = new Intent(Main.this, RechercheSimple.class);
                startActivity(intent1);
                // }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if(view==mButton) {
                ConnectivityManager connMgr = (ConnectivityManager)
                        getSystemService(Main.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
                if (networkInfo != null && networkInfo.isConnected()) {
                    // fetch data
                    Intent intent2 = new Intent(Main.this, TypeRecherche.class);
                    startActivity(intent2);
                }
                else {
                    // display error
                    Intent intent3 = new Intent(Main.this, NoData.class);
                    startActivity(intent3);
                }
            }});

    }}





