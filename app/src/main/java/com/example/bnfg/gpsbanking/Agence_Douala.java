package com.example.bnfg.gpsbanking;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BNFG on 18/07/2017.
 */

public class Agence_Douala extends AppCompatActivity {

    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agence_douala);
        mListView = (ListView) findViewById(R.id.listView);

        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(Agence_Douala.this, tweets);
        mListView.setAdapter(adapter);
    }
    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bonanjo Tel:(237) 233 42 68 00", "Rue JOSS"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Akwa Tel:(237)233 42 76 97", "A cote de SOCAR"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Akwa Millenium Tel:(237) 233 43 14 53", "Ancien DALIP"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence New-Bell Tel:(237)233 43 11 17", "Carrefour ANATOLE"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Mboppi Tel:(237) 233 42 17 90", "Marche MBOPPI"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Ndokotti Tel:(237) 233 41 32 45", "Face SONEL Ndokotti"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bonamoussadi Tel:(237) 233 47 88 46", "Tradex Bonamoussadi"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bessengue Tél:(237) 233 41 35 07", "Feu Rouge Bessengue"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Dakar Tel:(237) 233 37 54 75", "Rond Point Marché Dakar"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence St Michel Tel:(237) 670 42 92 93", "Nkoulouloun en face de la boulangerie du boulevard"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bonabéri Tel:(237) 233 39 30 04", "Grand Hangar"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Cité Des Palmiers Tél:(237)233 39 30 04", "Descente hopital de district"));
        return tweets;
}}
