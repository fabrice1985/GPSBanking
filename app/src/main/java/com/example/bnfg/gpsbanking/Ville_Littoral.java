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

public class Ville_Littoral extends AppCompatActivity {
    private Button mButton;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ville_littoral);
        mButton = (Button) findViewById(R.id.btndouala);
        mButton1 = (Button) findViewById(R.id.btnlimbe);
        mButton2 = (Button) findViewById(R.id.btnnkongsamba);
        mButton3 = (Button) findViewById(R.id.btnkumba);
        Intent i = getIntent();
        int id1 = i.getIntExtra(Regions.ide,0);
        //int id2 = i.getIntExtra(id,0);
        switch (id1){
        case 1:
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton)

                Intent intent = new Intent(Ville_Littoral.this, Agence_Douala.class);
                startActivity(intent);

                // }
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent1 = new Intent(Ville_Littoral.this, Agence_Limbe.class);
                startActivity(intent1);
                // }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent2 = new Intent(Ville_Littoral.this, Agence_Nkongsamba.class);
                startActivity(intent2);
                // }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent3 = new Intent(Ville_Littoral.this, Agence_Kumba.class);
                startActivity(intent3);
                // }
            }
        });
            break;
            case 2:
                mButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // if(view==mButton)

                        Intent intent = new Intent(Ville_Littoral.this, Gab_Douala.class);
                        startActivity(intent);

                        // }
                    }
                });

                break;
            case 3:
                mButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // if(view==mButton)

                        Intent intent = new Intent(Ville_Littoral.this, Tpe_Douala.class);
                        startActivity(intent);

                        // }
                    }
                });
            break;
            case 4:
                mButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // if(view==mButton)

                        Intent intent = new Intent(Ville_Littoral.this, Flash_Trans_Douala.class);
                        startActivity(intent);

                        // }
                    }
                });
                break;
            case 6:
                mButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // if(view==mButton)

                        Intent intent = new Intent(Ville_Littoral.this, Flash_Trans_Douala.class);
                        startActivity(intent);

                        // }
                    }
                });
                break;
    }
}}
