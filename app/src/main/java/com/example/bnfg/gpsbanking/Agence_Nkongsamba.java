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

public class Agence_Nkongsamba extends AppCompatActivity {
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agence_nkongsamba);
        mListView = (ListView) findViewById(R.id.listView);

        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(Agence_Nkongsamba.this, tweets);
        mListView.setAdapter(adapter);
    }
    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.MAGENTA, "Agence Nkongsamba  Tel:(237) 233 49 25 66 ","Quartier I en face de Talla Voyage"));
        return tweets;
    }
    }

