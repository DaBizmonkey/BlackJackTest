package com.example.student.myapplication;

/**
 * Created by preston on 1/14/16.
 */
public class Card {
    int suit = 0;
    int rank = 0;
    int num;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        num = suit * 13 + rank;
    }
}
