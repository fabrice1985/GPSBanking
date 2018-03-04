package com.example.bnfg.gpsbanking;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BNFG on 19/07/2017.
 */

public class Gab_Douala extends AppCompatActivity {
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gab_douala);
        mListView = (ListView) findViewById(R.id.listView);

        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(Gab_Douala.this, tweets);
        mListView.setAdapter(adapter);
    }
    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Bonanjo", "Nombre de GAB: 3"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Akwa Dalip", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Akwa Millenium", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence New-Bell", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Mboppi", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Ndokotti", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Bonamoussadi", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Bessengue", "Nombre de GAB : 1"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Dakar", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence St Michel", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Bonabéri", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Agence Cité Des Palmiers", "Nombre de GAB : 2"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Aeroport de Douala", "Nombre de GAB : 1"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Santa lucia Cité CICAM", "Nombre de GAB : 1"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB BOCOM Makèpè Missoke", "Nombre de GAB : 1"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB TCHOP et YAMO Bonamoussadi", "Nombre de GAB : 1"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB BANO PALACE", "Nombre de GAB : 1"));
        tweets.add(new Tweet(Color.MAGENTA, "GAB Touristique Akwa", "Nombre de GAB : 1"));
        return tweets;
    }
}
