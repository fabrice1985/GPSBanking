package com.example.bnfg.gpsbanking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by BNFG on 30/08/2017.
 */

public class TypeRecherche extends AppCompatActivity {
   // MapsActivity map = new MapsActivity();
    private Button mButton1;
    private Button mButton2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type_recherche);

        mButton1 = (Button) findViewById(R.id.btnrecherche_par_carte);
        mButton2 = (Button) findViewById(R.id.btnrecherche_par_liste);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent = new Intent(TypeRecherche.this, PermissionGps.class);
                startActivity(intent);
                // }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if(view==mButton) {
                Intent intent1 = new Intent(TypeRecherche.this, RechercheSimple.class);
                startActivity(intent1);
                // }
            }
        });
    }
}
