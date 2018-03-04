package com.example.bnfg.gpsbanking;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.example.bnfg.gps.MapsActivity;

/**
 * Created by BNFG on 02/09/2017.
 */

public class PermissionGps extends AppCompatActivity {
    private void createGpsDisabledAlert() {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
        localBuilder
                .setMessage("Le GPS est inactif, voulez-vous l'activer ?")
                .setCancelable(false)
                .setPositiveButton("Activer GPS ",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                                PermissionGps.this.showGpsOptions();
                            }
                        }
                );
        localBuilder.setNegativeButton("Ne pas l'activer ",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        paramDialogInterface.cancel();
                        PermissionGps.this.finish();
                    }
                }
        );
        localBuilder.create().show();
    }

    private void showGpsOptions() {
        //startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        MapsActivity map = new MapsActivity();
        Intent intent1 = new Intent(PermissionGps.this, MapsActivity.class);
        startActivity(intent1);
        finish();
    }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        createGpsDisabledAlert();
    }
}
