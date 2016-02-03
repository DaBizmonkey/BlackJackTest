package com.example.student.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
Button but;
    View rootView;
    TextView tv;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);

        deckSetup();

        tv = (TextView) rootView.findViewById(R.id.textView);
        tv.setText("Card Number: " + 0 + "\nSuit: " + GetterSetter.cards[0].suit + "\nRank:" + GetterSetter.cards[0].rank);
                tv.setTextSize(40);
        tv.setTextColor(Color.WHITE);


         
rootView.setBackgroundColor(Color.BLACK);

        // Set the color

        return rootView;
    }

    public void deckSetup() {
        GetterSetter.cards = new Card[52];
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                GetterSetter.cards[suit * 13 + rank] = new Card(suit, rank);
            }
        }
    }

    public void shuffleDeck() {
        Card temp;
        for (int i = 0; i < 52; i++) {
            int randomCard = (int) (Math.random() * 52);
            temp = GetterSetter.cards[randomCard];
            GetterSetter.cards[randomCard] = GetterSetter.cards[i];
            GetterSetter.cards[i] = temp;
        }
    }



}