package com.example.bnfg.gpsbanking;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BNFG on 26/07/2017.
 */

public class Money_Gram_Douala extends AppCompatActivity {
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_gram_douala);
        mListView = (ListView) findViewById(R.id.listView);

        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(Money_Gram_Douala.this, tweets);
        mListView.setAdapter(adapter);
    }
    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bonanjo", "Rue JOSS"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Akwa", "A cote de SOCAR"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Akwa Millenium", "Ancien DALIP"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Nez-Bell", "Carrefour ANATOLE"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Mboppi", "Marche MBOPPI"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Ndokotti", "Face SONEL Ndokotti"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bonamoussadi", "Tradex Bonamoussadi"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bessengue", "Feu Rouge Bessengue"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Dakar", "Rond Point Marché Dakar"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence St Michel", "Nkoulouloun en face de la boulangerie du boulevard"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Bonabéri", "Grand Hangar"));
        tweets.add(new Tweet(Color.MAGENTA, "Agence Cité Des Palmiers", "Descente hopital de district"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE PRESTIGE", "Face Palais DIKA AKWA Derriere BGFI"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE AKWA LIBERTE", "Boulevard de la liberté prés hôtel parfait Garden"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE BESSENGUE", "Boulevard de la république près hôtel LEWAT"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE BONAMOUSSADI SABLE", "Face Direction FOREVER LIVING PRODUCTS"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE NEW-BELL", "Face commissariat 2eme"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE CITE-CICAM", "Face entrée stade CITE-CICAM"));
        tweets.add(new Tweet(Color.MAGENTA, "CREDIT POPULAIRE BONABERI", "Ancienne route non loin petit pont BESSEKE"));
        tweets.add(new Tweet(Color.MAGENTA, "FREE CASH DOUALA", "Bonabéri, Bepanda, Village"));
        tweets.add(new Tweet(Color.MAGENTA, "INSTANT TRANSFER DOUALA SAKER", "Boulangerie SAKER DOUALA"));
        tweets.add(new Tweet(Color.MAGENTA, "JULLY SA DOUALA", "Immeuble Air France Bonanjo"));
        tweets.add(new Tweet(Color.MAGENTA, "MUFFA DOUALA", "Texaco BALI"));
        return tweets;
    }
}
