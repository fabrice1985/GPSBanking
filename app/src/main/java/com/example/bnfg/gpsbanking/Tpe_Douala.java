package com.example.bnfg.gpsbanking;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BNFG on 25/07/2017.
 */

public class Tpe_Douala extends AppCompatActivity {
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tpe_douala);
        mListView = (ListView) findViewById(R.id.listView);

        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(Tpe_Douala.this, tweets);
        mListView.setAdapter(adapter);
    }
    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.MAGENTA, "BONANJO", "SAAR SA"));
        tweets.add(new Tweet(Color.MAGENTA, "BONANJO", "Elegance Pressing"));
        tweets.add(new Tweet(Color.MAGENTA, "BONANJO", "BELAVIE"));
        tweets.add(new Tweet(Color.MAGENTA, "BONANJO", "Pharmacie Saint NICOLAS"));
        tweets.add(new Tweet(Color.MAGENTA, "BONANJO", "CASH ADVANCE"));
        tweets.add(new Tweet(Color.MAGENTA, "BONANJO", "agence Afriland"));
        tweets.add(new Tweet(Color.MAGENTA, "BALI", "SOMMATEL Hotel"));
        tweets.add(new Tweet(Color.MAGENTA, "BALI", "OILIBYA Canton Bell"));
        tweets.add(new Tweet(Color.MAGENTA, "Rue KING AKWA", "MAHIMA"));
        tweets.add(new Tweet(Color.MAGENTA, "Rue KING AKWA", "MAHIMA PLUS"));
        tweets.add(new Tweet(Color.MAGENTA, "Boulevard de la LIBERTE", "AKWA PALACE"));
        tweets.add(new Tweet(Color.MAGENTA, "Boulevard de la LIBERTE", "FOKOU BEACH"));
        tweets.add(new Tweet(Color.MAGENTA, "Boulevard de la LIBERTE", "CASH ADVANCE AKWA"));
        tweets.add(new Tweet(Color.MAGENTA, "Boulevard de la LIBERTE", "BANO PALACE"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "EDMARK"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "L'OVALIE"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "LA FINALE BONAPRISO"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "Pharmacie de GAULLE"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "LA COUPOLE RESTAURANT"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "STAR LAND HOTEL"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "Pharmacie de GAULLE"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "Ets FANNY"));
        tweets.add(new Tweet(Color.MAGENTA, "BONAPRISO", "CASH BACK New-Bell"));
        return tweets;
    }
}
