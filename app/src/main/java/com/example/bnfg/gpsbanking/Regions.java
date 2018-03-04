package com.example.bnfg.gpsbanking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by BNFG on 18/07/2017.
 */

public class Regions extends AppCompatActivity {
    private Button mButton;
    public final static String ide= "identifiant";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regions);
        mButton = (Button) findViewById(R.id.btnlittoral);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent i = getIntent();
                int id1 = i.getIntExtra(RechercheSimple.id,0);
                Intent intent = new Intent(Regions.this, Ville_Littoral.class);
                intent.putExtra(ide, id1);
                startActivity(intent);
                // }
    }
        });
}}
