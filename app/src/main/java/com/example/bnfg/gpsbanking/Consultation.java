package com.example.bnfg.gpsbanking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by BNFG on 13/07/2017.
 */

public class Consultation extends AppCompatActivity {
    private Button mButton;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultation);
        mButton = (Button) findViewById(R.id.btnefirst);
        mButton1 = (Button) findViewById(R.id.btnmoney);
        mButton2 = (Button) findViewById(R.id.btnflash);
        mButton3 = (Button) findViewById(R.id.btncompte);
        mButton4 = (Button) findViewById(R.id.btntpe);
        mButton5 = (Button) findViewById(R.id.btngab);
        mButton6 = (Button) findViewById(R.id.btncarte);
        mButton7 = (Button) findViewById(R.id.btnmoneygram);
        mButton8 = (Button) findViewById(R.id.btnsmallworld);
        mButton9 = (Button) findViewById(R.id.btnsmsfirst);
        mButton10 = (Button) findViewById(R.id.btnmac);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // if(view==mButton) {
                    Intent intent = new Intent(Consultation.this, Efirst.class);
                    startActivity(intent);
                //}
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
               // if(view1==mButton1) {
                    Intent intent1 = new Intent(Consultation.this, Mobile_money.class);
                    startActivity(intent1);
               // }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                // if(view1==mButton1) {
                Intent intent2 = new Intent(Consultation.this, Flash_transfer.class);
                startActivity(intent2);
                // }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                // if(view1==mButton1) {
                Intent intent3 = new Intent(Consultation.this, Comptes.class);
                startActivity(intent3);
                // }
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                // if(view1==mButton1) {
                Intent intent4 = new Intent(Consultation.this, Tpe.class);
                startActivity(intent4);
                // }
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                // if(view1==mButton1) {
                Intent intent5 = new Intent(Consultation.this, Gab.class);
                startActivity(intent5);
                // }
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                // if(view1==mButton1) {
                Intent intent6 = new Intent(Consultation.this, Carte_Bancaire.class);
                startActivity(intent6);
                // }
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent7 = new Intent(Consultation.this, Money_Gram.class);
                startActivity(intent7);
                //}
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent8 = new Intent(Consultation.this, Small_World.class);
                startActivity(intent8);
                //}
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent9 = new Intent(Consultation.this, Sms_First.class);
                startActivity(intent9);
                //}
            }
        });
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(view==mButton) {
                Intent intent10 = new Intent(Consultation.this, Mac.class);
                startActivity(intent10);
                //}
            }
        });
    }
}
