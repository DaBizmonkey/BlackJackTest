package com.example.student.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by preston on 1/26/16.
 */
public class CardDraw {
    static Bitmap twoclubs;
    static Bitmap threeclubs;
    static Bitmap fourclubs;
    static Bitmap fiveclubs;
    static Bitmap sixclubs;
    static Bitmap sevenclubs;
    static Bitmap eightclubs;
    static Bitmap nineclubs;
    static Bitmap tenclubs;
    static Bitmap jackclubs;
    static Bitmap kingclubs;
    static Bitmap queenclubs;
    static Bitmap aceclubs;
    static Bitmap twohearts;
    static Bitmap threehearts;
    static Bitmap fourhearts;
    static Bitmap fivehearts;
    static Bitmap sixhearts;
    static Bitmap sevenhearts;
    static Bitmap eighthearts;
    static Bitmap ninehearts;
    static Bitmap tenhearts;
    static Bitmap jackhearts;
    static Bitmap kinghearts;
    static Bitmap queenhearts;
    static Bitmap acehearts;
    static Bitmap twospades;
    static Bitmap threespades;
    static Bitmap fourspades;
    static Bitmap fivespades;
    static Bitmap sixspades;
    static Bitmap sevenspades;
    static Bitmap eightspades;
    static Bitmap ninespades;
    static Bitmap tenspades;
    static Bitmap jackspades;
    static Bitmap kingspades;
    static Bitmap queenspades;
    static Bitmap acespades;
    static Bitmap twodiamonds;
    static Bitmap threediamonds;
    static Bitmap fourdiamonds;
    static Bitmap fivediamonds;
    static Bitmap sixdiamonds;
    static Bitmap sevendiamonds;
    static Bitmap eightdiamonds;
    static Bitmap ninediamonds;
    static Bitmap tendiamonds;
    static Bitmap jackdiamonds;
    static Bitmap kingdiamonds;
    static Bitmap queendiamonds;
    static Bitmap acediamonds;

    public CardDraw(Context context) {
        twoclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.twoclubs);
        twoclubs = Bitmap.createScaledBitmap(twoclubs, twoclubs.getWidth() / 3, twoclubs.getHeight() / 3, false);
        threeclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.threeclubs);
        threeclubs = Bitmap.createScaledBitmap(threeclubs, threeclubs.getWidth() / 3, threeclubs.getHeight() / 3, false);
        fourclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourclubs);
        fourclubs = Bitmap.createScaledBitmap(fourclubs, fourclubs.getWidth() / 3, fourclubs.getHeight() / 3, false);
        fiveclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.fiveclubs);
        fiveclubs = Bitmap.createScaledBitmap(fiveclubs, fiveclubs.getWidth() / 3, fiveclubs.getHeight() / 3, false);
        sixclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixclubs);
        sixclubs = Bitmap.createScaledBitmap(sixclubs, sixclubs.getWidth() / 3, sixclubs.getHeight() / 3, false);
        sevenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevenclubs);
        sevenclubs = Bitmap.createScaledBitmap(sevenclubs, sevenclubs.getWidth() / 3, sevenclubs.getHeight() / 3, false);
        eightclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.eightclubs);
        eightclubs = Bitmap.createScaledBitmap(eightclubs, eightclubs.getWidth() / 3, eightclubs.getHeight() / 3, false);
        nineclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.nineclubs);
        nineclubs = Bitmap.createScaledBitmap(nineclubs, nineclubs.getWidth() / 3, nineclubs.getHeight() / 3, false);
        tenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.tenclubs);
        tenclubs = Bitmap.createScaledBitmap(tenclubs, tenclubs.getWidth() / 3, tenclubs.getHeight() / 3, false);
        jackclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackclubs);
        jackclubs = Bitmap.createScaledBitmap(jackclubs, jackclubs.getWidth() / 3, jackclubs.getHeight() / 3, false);
        queenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.queenclubs);
        queenclubs = Bitmap.createScaledBitmap(queenclubs, queenclubs.getWidth() / 3, queenclubs.getHeight() / 3, false);
        kingclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.kingclubs);
        kingclubs = Bitmap.createScaledBitmap(kingclubs, kingclubs.getWidth() / 3, kingclubs.getHeight() / 3, false);
        aceclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.aceclubs);
        aceclubs = Bitmap.createScaledBitmap(aceclubs, aceclubs.getWidth() / 3, aceclubs.getHeight() / 3, false);
        twohearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.twohearts);
        twohearts = Bitmap.createScaledBitmap(twohearts, twohearts.getWidth() / 3, twohearts.getHeight() / 3, false);
        threehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.threehearts);
        threehearts = Bitmap.createScaledBitmap(threehearts, threehearts.getWidth() / 3, threehearts.getHeight() / 3, false);
        fourhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourhearts);
        fourhearts = Bitmap.createScaledBitmap(fourhearts, fourhearts.getWidth() / 3, fourhearts.getHeight() / 3, false);
        fivehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.fivehearts);
        fivehearts = Bitmap.createScaledBitmap(fivehearts, fivehearts.getWidth() / 3, fivehearts.getHeight() / 3, false);
        sixhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixhearts);
        sixhearts = Bitmap.createScaledBitmap(sixhearts, sixhearts.getWidth() / 3, sixhearts.getHeight() / 3, false);
        sevenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevenhearts);
        sevenhearts = Bitmap.createScaledBitmap(sevenhearts, sevenhearts.getWidth() / 3, sevenhearts.getHeight() / 3, false);
        eighthearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.eighthearts);
        eighthearts = Bitmap.createScaledBitmap(eighthearts, eighthearts.getWidth() / 3, eighthearts.getHeight() / 3, false);
        ninehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.ninehearts);
        ninehearts = Bitmap.createScaledBitmap(ninehearts, ninehearts.getWidth() / 3, ninehearts.getHeight() / 3, false);
        tenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.tenhearts);
        tenhearts = Bitmap.createScaledBitmap(tenhearts, tenhearts.getWidth() / 3, tenhearts.getHeight() / 3, false);
        jackhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackhearts);
        jackhearts = Bitmap.createScaledBitmap(jackhearts, jackhearts.getWidth() / 3, jackhearts.getHeight() / 3, false);
        queenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.queenhearts);
        queenhearts = Bitmap.createScaledBitmap(queenhearts, queenhearts.getWidth() / 3, queenhearts.getHeight() / 3, false);
        kinghearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.kinghearts);
        kinghearts = Bitmap.createScaledBitmap(kinghearts, kinghearts.getWidth() / 3, kinghearts.getHeight() / 3, false);
        acehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.acehearts);
        acehearts = Bitmap.createScaledBitmap(acehearts, acehearts.getWidth() / 3, acehearts.getHeight() / 3, false);
        twodiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.twodiamonds);
        twodiamonds = Bitmap.createScaledBitmap(twodiamonds, twodiamonds.getWidth() / 3, twodiamonds.getHeight() / 3, false);
        threediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.threediamonds);
        threediamonds = Bitmap.createScaledBitmap(threediamonds, threediamonds.getWidth() / 3, threediamonds.getHeight() / 3, false);
        fourdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourdiamonds);
        fourdiamonds = Bitmap.createScaledBitmap(fourdiamonds, fourdiamonds.getWidth() / 3, fourdiamonds.getHeight() / 3, false);
        fivediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.fivediamonds);
        fivediamonds = Bitmap.createScaledBitmap(fivediamonds, fivediamonds.getWidth() / 3, fivediamonds.getHeight() / 3, false);
        sixdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixdiamonds);
        sixdiamonds = Bitmap.createScaledBitmap(sixdiamonds, sixdiamonds.getWidth() / 3, sixdiamonds.getHeight() / 3, false);
        sevendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevendiamonds);
        sevendiamonds = Bitmap.createScaledBitmap(sevendiamonds, sevendiamonds.getWidth() / 3, sevendiamonds.getHeight() / 3, false);
        eightdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.eightdiamonds);
        eightdiamonds = Bitmap.createScaledBitmap(eightdiamonds, eightdiamonds.getWidth() / 3, eightdiamonds.getHeight() / 3, false);
        ninediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.ninediamonds);
        ninediamonds = Bitmap.createScaledBitmap(ninediamonds, ninediamonds.getWidth() / 3, ninediamonds.getHeight() / 3, false);
        tendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.tendiamonds);
        tendiamonds = Bitmap.createScaledBitmap(tendiamonds, tendiamonds.getWidth() / 3, tendiamonds.getHeight() / 3, false);
        jackdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackdiamonds);
        jackdiamonds = Bitmap.createScaledBitmap(jackdiamonds, jackdiamonds.getWidth() / 3, jackdiamonds.getHeight() / 3, false);
        queendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.queendiamonds);
        queendiamonds = Bitmap.createScaledBitmap(queendiamonds, queendiamonds.getWidth() / 3, queendiamonds.getHeight() / 3, false);
        kingdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.kingdiamonds);
        kingdiamonds = Bitmap.createScaledBitmap(kingdiamonds, kingdiamonds.getWidth() / 3, kingdiamonds.getHeight() / 3, false);
        acediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.acediamonds);
        acediamonds = Bitmap.createScaledBitmap(acediamonds, acediamonds.getWidth() / 3, acediamonds.getHeight() / 3, false);
        twospades = BitmapFactory.decodeResource(context.getResources(), R.drawable.twospades);
        twospades = Bitmap.createScaledBitmap(twospades, twospades.getWidth() / 3, twospades.getHeight() / 3, false);
        threespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.threespades);
        threespades = Bitmap.createScaledBitmap(threespades, threespades.getWidth() / 3, threespades.getHeight() / 3, false);
        fourspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.fourspades);
        fourspades = Bitmap.createScaledBitmap(fourspades, fourspades.getWidth() / 3, fourspades.getHeight() / 3, false);
        fivespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.fivespades);
        fivespades = Bitmap.createScaledBitmap(fivespades, fivespades.getWidth() / 3, fivespades.getHeight() / 3, false);
        sixspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.sixspades);
        sixspades = Bitmap.createScaledBitmap(sixspades, sixspades.getWidth() / 3, sixspades.getHeight() / 3, false);
        sevenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.sevenspades);
        sevenspades = Bitmap.createScaledBitmap(sevenspades, sevenspades.getWidth() / 3, sevenspades.getHeight() / 3, false);
        eightspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.eightspades);
        eightspades = Bitmap.createScaledBitmap(eightspades, eightspades.getWidth() / 3, eightspades.getHeight() / 3, false);
        ninespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.ninespades);
        ninespades = Bitmap.createScaledBitmap(ninespades, ninespades.getWidth() / 3, ninespades.getHeight() / 3, false);
        tenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.tenspades);
        tenspades = Bitmap.createScaledBitmap(tenspades, tenspades.getWidth() / 3, tenspades.getHeight() / 3, false);
        jackspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.jackspades);
        jackspades = Bitmap.createScaledBitmap(jackspades, jackspades.getWidth() / 3, jackspades.getHeight() / 3, false);
        queenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.queenspades);
        queenspades = Bitmap.createScaledBitmap(queenspades, queenspades.getWidth() / 3, queenspades.getHeight() / 3, false);
        kingspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.kingspades);
        kingspades = Bitmap.createScaledBitmap(kingspades, kingspades.getWidth() / 3, kingspades.getHeight() / 3, false);
        acespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.acespades);
        acespades = Bitmap.createScaledBitmap(acespades, acespades.getWidth() / 3, acespades.getHeight() / 3, false);
    }

    public static Bitmap getBitmap(int suit, int rank) {
        if (suit == 0) {
            GetterSetter.setThing("clubs");
            if (rank == 0) {
                return twoclubs;
            } else if (rank == 1) {
                return threeclubs;
            } else if (rank == 2) {
                return fourclubs;
            } else if (rank == 3) {
                return fiveclubs;
            } else if (rank == 4) {
                return sixclubs;
            } else if (rank == 5) {
                return sevenclubs;
            } else if (rank == 6) {
                return eightclubs;
            } else if (rank == 7) {
                return nineclubs;
            } else if (rank == 8) {
                return tenclubs;
            } else if (rank == 9) {
                return jackclubs;
            } else if (rank == 10) {
                return queenclubs;
            } else if (rank == 11) {
                return kingclubs;
            } else if (rank == 12) {
                return aceclubs;
            }
        } else if (suit == 1) {
            GetterSetter.setThing("diamonds");
            if (rank == 0) {
                return twodiamonds;
            } else if (rank == 1) {
                return threediamonds;
            } else if (rank == 2) {
                return fourdiamonds;
            } else if (rank == 3) {
                return fivediamonds;
            } else if (rank == 4) {
                return sixdiamonds;
            } else if (rank == 5) {
                return sevendiamonds;
            } else if (rank == 6) {
                return eightdiamonds;
            } else if (rank == 7) {
                return ninediamonds;
            } else if (rank == 8) {
                return tendiamonds;
            } else if (rank == 9) {
                return jackdiamonds;
            } else if (rank == 10) {
                return queendiamonds;
            } else if (rank == 11) {
                return kingdiamonds;
            } else if (rank == 12) {
                return acediamonds;
            }
        } else if (suit == 2) {
            GetterSetter.setThing("spades");
            if (rank == 0) {
                return twospades;
            } else if (rank == 1) {
                return threespades;
            } else if (rank == 2) {
                return fourspades;
            } else if (rank == 3) {
                return fivespades;
            } else if (rank == 4) {
                return sixspades;
            } else if (rank == 5) {
                return sevenspades;
            } else if (rank == 6) {
                return eightspades;
            } else if (rank == 7) {
                return ninespades;
            } else if (rank == 8) {
                return tenspades;
            } else if (rank == 9) {
                return jackspades;
            } else if (rank == 10) {
                return queenspades;
            } else if (rank == 11) {
                return kingspades;
            } else if (rank == 12) {
                return acespades;
            }
        } else if (suit == 3) {
            GetterSetter.setThing("hearts");
            if (rank == 0) {
                return twohearts;
            } else if (rank == 1) {
                return threehearts;
            } else if (rank == 2) {
                return fourhearts;
            } else if (rank == 3) {
                return fivehearts;
            } else if (rank == 4) {
                return sixhearts;
            } else if (rank == 5) {
                return sevenhearts;
            } else if (rank == 6) {
                return eighthearts;
            } else if (rank == 7) {
                return ninehearts;
            } else if (rank == 8) {
                return tenhearts;
            } else if (rank == 9) {
                return jackhearts;
            } else if (rank == 10) {
                return queenhearts;
            } else if (rank == 11) {
                return kinghearts;
            } else if (rank == 12) {
                return acehearts;
            }
        }
        return acespades;
    }
}
