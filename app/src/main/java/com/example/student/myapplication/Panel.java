package com.example.student.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by student on 12/8/15.
 */
public class Panel extends SurfaceView implements SurfaceHolder.Callback{
    //GLOBAL VARIABLES
    Paint paint;
    private CanvasThread canvasthread;


        CardDraw cardDraw;

    //Variables used to hold our bitmaps


    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub

        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
        paint = new Paint();
        cardDraw = new CardDraw(context);
    }




    public Panel(Context context) {
        super(context);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
        CardDraw cardDraw = new CardDraw(context);

    }




    @Override
    public void onDraw(Canvas canvas) {

        canvas.drawColor(Color.BLACK);
        canvas.drawBitmap(GetterSetter.cards[GetterSetter.current].bmap, 0.0f, 1000.0f, null);
        canvas.drawBitmap(GetterSetter.cards[GetterSetter.current1].bmap, 400.0f, 1000.0f, null);
        canvas.drawBitmap(GetterSetter.cards[GetterSetter.current2].bmap, 800.0f, 1000.0f, null);



        }



    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        canvasthread.setRunning(true);
        canvasthread.start();


    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        boolean retry = true;
        canvasthread.setRunning(false);
        while (retry) {
            try {
                canvasthread.join();
                retry = false;
            } catch (InterruptedException e) {
                // we will try it again and again...
            }
        }





    }


}